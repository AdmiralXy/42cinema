<#import "../layouts/application.ftl" as base>

<@base.layout; section>
    <#if section="css">
        <link rel="stylesheet" href="${springMacroRequestContext.contextPath}/css/session.css" />
    </#if>
    <#if section="content">
        <div class="col-xl-3 pt-5">
            <div class="session-poster">
                <img class="session-poster__image"
                     src="${springMacroRequestContext.contextPath}/images/posters/${session.film.id}.jpg"
                     alt="none"
                >
            </div>
        </div>
        <div class="col-xl-9 m pt-5">
            <div class="session-info">
                <p class="session-info__title">
                    ${session.film.title}
                </p>
                <p class="session-info__rating">
                    ${session.film.releaseYear?string.computer}, ${session.film.ageRestrictions}
                </p>
                <p class="session-info__description">
                    ${session.film.description}
                </p>
            </div>
            <a href="${springMacroRequestContext.contextPath}/films/${session.film.id}/chat" class="btn btn-primary btn-sm btn-chat mb-5">Discussion chat</a>
            <div class="session-hall">
                <p class="session-hall__info">
                    Hall #${session.hall.serial}, ${session.hall.seats} seats
                </p>
                <p class="session-hall__info">
                    ${session.start_at}
                </p>
                <p class="session-hall__price">
                    ${session.cost} $
                </p>
            </div>
        </div>
    </#if>
</@base.layout>