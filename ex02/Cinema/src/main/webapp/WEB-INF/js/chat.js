const username = 'user' + Math.floor(Math.random() * Number.MAX_SAFE_INTEGER).toString().slice(0, 8)
let filmId = null
let stompClient = null

function connect() {
    let socket = new SockJS('/ws')
    stompClient = Stomp.over(socket)
    stompClient.connect({}, function(frame) {
        console.log('Connected: ' + frame)
        stompClient.subscribe(`/films/${filmId}/chat/messages`, function(messageOutput) {
            const message = JSON.parse(messageOutput.body)
            if (message && message.id > 0 && message.created_at) {
                showMessage(message)
            }
        })
    })
}

function disconnect() {
    if(stompClient != null)
        stompClient.disconnect()
}

function sendMessage() {
    const input = $('input[name="message"]')
    const message = input.val()
    input.val('')
    if (message.length > 0) {
        stompClient.send(`/films/${filmId}/chat/messages`, {},
            JSON.stringify({
                film_id: filmId,
                username,
                message,
            })
        )
    }
}

function showMessage(message) {
    console.log(message)
    $('.chat__container').prepend(() => {
        return `
            <div class="chat-message">
                <p class="chat-message__date">${message.created_at}</p>
                <p class="chat-message__author">${message.username}</p>
                <p class="chat-message__text">${message.message}</p>
            </div>
        `
    })
}

$(document).ready(function() {
    filmId = $('input[name="film_id"]').val()
    connect()
});

$(window).bind('beforeunload', function(){
    disconnect()
});

$('.input-message__button').click(() => {
    sendMessage()
})