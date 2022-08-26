<#import "../../layouts/application.ftl" as base>
<#import "../../components/modal.ftl" as modal>

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
        <#list sessions as session>
            <div class="page-card col-xxl-3 col-xl-4 col-md-6">
                <a class="session" href="${springMacroRequestContext.contextPath}/sessions/${session.film.id}" style="background-image: url('${springMacroRequestContext.contextPath}/images/posters/${session.film.id}.jpg')">
                    <div class="session__content">
                        <p class="session__content__film">${session.film.title}</p>
                        <p class="session__content__text">Hall #${session.hall.serial}</p>
                        <p class="session__content__text">${session.start_at}</p>
                        <p class="session__content__text">${session.cost}$</p>
                    </div>
                </a>
            </div>
        </#list>
    </#if>
</@base.layout>