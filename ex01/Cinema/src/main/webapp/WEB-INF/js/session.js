function updateSessionList(sessions) {
    $('.page-card').empty()
    sessions.forEach(session => {
        $('.search-form').after(() => {
            return `
                <div class="page-card col-xxl-3 col-xl-4 col-md-6">
                    <div class="session" style="background-image: url('/images/posters/${session.film.id}.jpg')">
                        <div class="session__content">
                            <p class="session__content__film">${session.film.title}</p>
                            <p class="session__content__text">Hall #${session.hall.serial}</p>
                            <p class="session__content__text">${session.start_at}</p>
                            <p class="session__content__text">${session.cost}$</p>
                        </div>
                    </div>
                </div>
            `
        })
    })
}

$('.search-form form').submit(function (event) {
    event.preventDefault()
    const filmName = $('input[name="filmName"]').val()
    $.ajax({
        url: `/sessions/search?filmName=${filmName}`,
        type: 'GET',
        dataType: 'json',
        success: function (res) {
            updateSessionList(res)
        }
    })
})