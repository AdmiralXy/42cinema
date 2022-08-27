<#import "../layouts/application.ftl" as base>
<#import "../components/modal.ftl" as modal>

<@base.layout; section>
    <#if section="css">
        <link rel="stylesheet" href="${springMacroRequestContext.contextPath}/css/chat.css"/>
    </#if>
    <#if section="content">
        <div class="col-12 pt-3 pb-5">
            <div class="film-info">
                <p class="film-info__title">${film.title} <span>chat discussion</span></p>
            </div>
        </div>
        <div class="col-12 pb-5">
            <div class="chat">
                <div class="chat__container">
                    <div class="chat-message">
                        <p class="chat-message__author">User #381</p>
                        <p class="chat-message__text">
                            Is it a good film?
                        </p>
                    </div>
                    <div class="chat-message">
                        <p class="chat-message__author">User #381</p>
                        <p class="chat-message__text">
                            Nah... That's remake, nothing happens.
                        </p>
                    </div>
                    <div class="chat-message">
                        <p class="chat-message__author">User #381</p>
                        <p class="chat-message__text">
                            Hello to everyone!
                        </p>
                    </div>
                    <div class="chat-message">
                        <p class="chat-message__author">User #381</p>
                        <p class="chat-message__text">
                            Is it a good film?
                        </p>
                    </div>
                    <div class="chat-message">
                        <p class="chat-message__author">User #381</p>
                        <p class="chat-message__text">
                            Nah... That's remake, nothing happens.
                        </p>
                    </div>
                    <div class="chat-message">
                        <p class="chat-message__author">User #381</p>
                        <p class="chat-message__text">
                            Hello to everyone!
                        </p>
                    </div>
                </div>
                <div class="input-message">
                    <div class="input-group">
                        <input type="text" class="form-control" name="message"
                               placeholder="Enter your message..." aria-describedby="message-describe">
                        <div class="input-group-append">
                            <button class="btn btn-outline-secondary input-message__button" type="button">
                                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24">
                                    <path d="M24 0l-6 22-8.129-7.239 7.802-8.234-10.458
                                    7.227-7.215-1.754 24-12zm-15 16.668v7.332l3.258-4.431-3.258-2.901z"/>
                                </svg>
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </#if>
</@base.layout>