<#import "../layouts/application.ftl" as base>
<#import "../components/modal.ftl" as modal>

<@base.layout; section>
    <#if section="css">
        <link rel="stylesheet" href="${springMacroRequestContext.contextPath}/css/chat.css"/>
    </#if>
    <#if section="js">
        <script src="${springMacroRequestContext.contextPath}/js/jquery-3.6.0.min.js"></script>
        <script src="${springMacroRequestContext.contextPath}/js/sockjs.min.js"></script>
        <script src="${springMacroRequestContext.contextPath}/js/stomp.min.js"></script>
        <script src="${springMacroRequestContext.contextPath}/js/chat.js"></script>
    </#if>
    <#if section="content">
        <input type="hidden" name="film_id" value="${film.id}" hidden>
        <div class="col-12 pt-3 pb-5">
            <div class="film-info">
                <p class="film-info__title">${film.title} <span>chat discussion</span></p>
            </div>
        </div>
        <div class="col-12 pb-5">
            <div class="chat">
                <div class="chat__container">
                    <#list messages as message>
                        <div class="chat-message">
                            <p class="chat-message__date">${message.created_at}</p>
                            <p class="chat-message__author">${message.username}</p>
                            <p class="chat-message__text">${message.message}</p>
                        </div>
                    </#list>
                </div>
                <div class="input-message">
                    <form class="input-message__form input-group">
                        <input type="text" class="form-control" name="message"
                               placeholder="Enter your message..." aria-describedby="message-describe">
                        <div class="input-group-append">
                            <button class="btn btn-outline-secondary input-message__button" type="submit">
                                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24">
                                    <path d="M24 0l-6 22-8.129-7.239 7.802-8.234-10.458
                                    7.227-7.215-1.754 24-12zm-15 16.668v7.332l3.258-4.431-3.258-2.901z"/>
                                </svg>
                            </button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </#if>
</@base.layout>