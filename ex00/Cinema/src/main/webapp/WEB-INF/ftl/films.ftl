<#import "layouts/application.ftl" as base>
<#import "components/modal.ftl" as modal>

<@base.layout; section>
    <#if section="css">
        <link rel="stylesheet" href="${springMacroRequestContext.contextPath}/css/films.css"/>
    </#if>
    <#if section="content">
        <div class="col-12 pb-5">
            <@modal.layout name="newFilm" description="New movie">
                <form method="POST" action="${springMacroRequestContext.contextPath}/admin/panel/save" enctype="multipart/form-data">
                    <div class="mb-3">
                        <div class="form-floating">
                            <input type="text" class="form-control" name="title" id="title" placeholder="Title" required>
                            <label for="title">Title</label>
                        </div>
                    </div>
                    <div class="mb-3">
                        <div class="form-floating">
                            <input type="number" class="form-control" name="release_date" id="release_date" placeholder="Year" required>
                            <label for="release_date">Year</label>
                        </div>
                    </div>
                    <div class="mb-3">
                        <label class="small" for="age_restrictions">Age restrictions</label>
                        <select class="form-select" name="age_restrictions" id="age_restrictions" required>
                            <option value="0+">0+</option>
                            <option value="6+">6+</option>
                            <option value="16+">16+</option>
                            <option value="16+">18+</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <div class="form-floating">
                            <textarea class="form-control" id="description" placeholder="Description"
                                      rows="24" required></textarea>
                            <label for="description">Description</label>
                        </div>
                    </div>
                    <div class="input-group mb-3">
                        <label class="input-group-text" for="poster">Poster</label>
                        <input type="file" class="form-control" name="poster" id="poster">
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
            </@modal.layout>
        </div>
        <div class="page-card col-xxl-3 col-xl-4 col-md-6">
            <div class="film">
                <div class="film__poster">
                    <img class="film__poster__image"
                         src="${springMacroRequestContext.contextPath}/img/placeholder-poster.jpg" alt="none">
                </div>
                <div class="film__info">
                    <p class="film__info__title">Inside Battle: Historical Drum</p>
                    <p class="film__info__release">2022, 12+</p>
                </div>
            </div>
        </div>
        <div class="page-card col-xxl-3 col-xl-4 col-md-6">
            <div class="film">
                <div class="film__poster">
                    <img class="film__poster__image"
                         src="${springMacroRequestContext.contextPath}/img/placeholder-poster.jpg" alt="none">
                </div>
                <div class="film__info">
                    <p class="film__info__title">Bad way to home</p>
                    <p class="film__info__release">2022, 16+</p>
                </div>
            </div>
        </div>
        <div class="page-card col-xxl-3 col-xl-4 col-md-6">
            <div class="film">
                <div class="film__poster">
                    <img class="film__poster__image"
                         src="${springMacroRequestContext.contextPath}/img/placeholder-poster.jpg" alt="none">
                </div>
                <div class="film__info">
                    <p class="film__info__title">Joker</p>
                    <p class="film__info__release">2022, 6+</p>
                </div>
            </div>
        </div>
        <div class="page-card col-xxl-3 col-xl-4 col-md-6">
            <div class="film">
                <div class="film__poster">
                    <img class="film__poster__image"
                         src="${springMacroRequestContext.contextPath}/img/placeholder-poster.jpg" alt="none">
                </div>
                <div class="film__info">
                    <p class="film__info__title">Interstellar</p>
                    <p class="film__info__release">2022, 18+</p>
                </div>
            </div>
        </div>
    </#if>
</@base.layout>