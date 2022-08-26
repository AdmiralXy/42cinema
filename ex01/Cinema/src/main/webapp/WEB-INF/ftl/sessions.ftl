<#import "layouts/application.ftl" as base>
<#import "components/modal.ftl" as modal>

<@base.layout; section>
    <#if section="css">
        <link rel="stylesheet" href="${springMacroRequestContext.contextPath}/css/sessions.css" />
    </#if>
    <#if section="content">
        <div class="col-12 pb-5">
            <@modal.layout name="newSession" description="New session">
                <form method="POST" action="#" enctype="multipart/form-data">
                    <div class="mb-3">
                        <label class="small" for="hall">Hall</label>
                        <select class="form-select" name="hall_id" id="hall" required>
                            <#list halls as hall>
                                <option value="${hall.id}">#${hall.serial} (${hall.seats} seats)</option>
                            </#list>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label class="small" for="film">Film</label>
                        <select class="form-select" name="film_id" id="film" required>
                            <#list films as film>
                                <option value="${film.id}">${film.title}</option>
                            </#list>
                        </select>
                    </div>
                    <div class="mb-3">
                        <div class="form-floating">
                            <input type="text" class="form-control" name="start_at" id="start_at" placeholder="Date and time" required>
                            <label for="start_at">Date and time</label>
                        </div>
                    </div>
                    <div class="mb-3">
                        <div class="input-group">
                            <input type="number" step="0.01" class="form-control" name="cost" placeholder="Ticket cost" aria-label="Ticket cost" aria-describedby="cost" required>
                            <span class="input-group-text" id="cost">$</span>
                        </div>
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
            </@modal.layout>
        </div>
        <div class="col-12 pb-5">
            <div class="input-group session-search">
                <input type="text" class="form-control" name="search"
                       placeholder="Enter the movie title to search the catalog..." aria-describedby="search-describe">
                <div class="input-group-append">
                    <button class="btn btn-outline-secondary session-search__button" type="button">
                        <svg width="24" height="24" xmlns="http://www.w3.org/2000/svg"
                             fill-rule="evenodd"
                             clip-rule="evenodd">
                            <path d="M15.853 16.56c-1.683 1.517-3.911 2.44-6.353
                        2.44-5.243 0-9.5-4.257-9.5-9.5s4.257-9.5 9.5-9.5 9.5
                        4.257 9.5 9.5c0 2.442-.923 4.67-2.44 6.353l7.44
                        7.44-.707.707-7.44-7.44zm-6.353-15.56c4.691 0 8.5 3.809
                        8.5 8.5s-3.809 8.5-8.5 8.5-8.5-3.809-8.5-8.5 3.809-8.5 8.5-8.5z"/>
                        </svg>
                    </button>
                </div>
            </div>
        </div>
        <#list sessions as session>
            <div class="page-card col-xxl-3 col-xl-4 col-md-6">
                <div class="session" style="background-image: url('${springMacroRequestContext.contextPath}/images/posters/${session.film.id}.jpg')">
                    <div class="session__content">
                        <p class="session__content__film">${session.film.title}</p>
                        <p class="session__content__text">Hall #${session.hall.serial}</p>
                        <p class="session__content__text">${session.start_at}</p>
                        <p class="session__content__text">${session.cost}$</p>
                    </div>
                </div>
            </div>
        </#list>
    </#if>
</@base.layout>