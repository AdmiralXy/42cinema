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
                            <option value="#">#46 (50 seats)</option>
                            <option value="#">#13 (23 seats)</option>
                            <option value="#">#42 (56 seats)</option>
                            <option value="#">#51 (14 seats)</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label class="small" for="film">Film</label>
                        <select class="form-select" name="film_id" id="film" required>
                            <option value="#">Interstellar</option>
                            <option value="#">Bohemian Rhapsody</option>
                            <option value="#">Iron man: C-lang and leaks</option>
                            <option value="#">Rights: agree?</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <div class="form-floating">
                            <input type="text" class="form-control" name="date" id="date" placeholder="Date and time" required>
                            <label for="date">Date and time</label>
                        </div>
                    </div>
                    <div class="mb-3">
                        <div class="input-group">
                            <input type="number" class="form-control" name="cost" placeholder="Ticket cost" aria-label="Ticket cost" aria-describedby="cost" required>
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
        <div class="page-card col-xxl-3 col-xl-4 col-md-6">
            <div class="session">
                <div class="session__content">
                    <p class="session__content__film">Interstellar</p>
                    <p class="session__content__text">Hall #45</p>
                    <p class="session__content__text">22.08.2022 10:25</p>
                    <p class="session__content__text">10.5$</p>
                </div>
            </div>

        </div>
        <div class="page-card col-xxl-3 col-xl-4 col-md-6">
            <div class="session">
                <div class="session__content">
                    <p class="session__content__film">Interstellar</p>
                    <p class="session__content__text">Hall #45</p>
                    <p class="session__content__text">22.08.2022 10:25</p>
                    <p class="session__content__text">10.5$</p>
                </div>
            </div>

        </div>
        <div class="page-card col-xxl-3 col-xl-4 col-md-6">
            <div class="session">
                <div class="session__content">
                    <p class="session__content__film">Interstellar</p>
                    <p class="session__content__text">Hall #45</p>
                    <p class="session__content__text">22.08.2022 10:25</p>
                    <p class="session__content__text">10.5$</p>
                </div>
            </div>

        </div>
        <div class="page-card col-xxl-3 col-xl-4 col-md-6">
            <div class="session">
                <div class="session__content">
                    <p class="session__content__film">Interstellar</p>
                    <p class="session__content__text">Hall #45</p>
                    <p class="session__content__text">22.08.2022 10:25</p>
                    <p class="session__content__text">10.5$</p>
                </div>
            </div>

        </div>
        <div class="page-card col-xxl-3 col-xl-4 col-md-6">
            <div class="session">
                <div class="session__content">
                    <p class="session__content__film">Interstellar</p>
                    <p class="session__content__text">Hall #45</p>
                    <p class="session__content__text">22.08.2022 10:25</p>
                    <p class="session__content__text">10.5$</p>
                </div>
            </div>

        </div>
        <div class="page-card col-xxl-3 col-xl-4 col-md-6">
            <div class="session">
                <div class="session__content">
                    <p class="session__content__film">Interstellar</p>
                    <p class="session__content__text">Hall #45</p>
                    <p class="session__content__text">22.08.2022 10:25</p>
                    <p class="session__content__text">10.5$</p>
                </div>
            </div>

        </div>
        <div class="page-card col-xxl-3 col-xl-4 col-md-6">
            <div class="session">
                <div class="session__content">
                    <p class="session__content__film">Interstellar</p>
                    <p class="session__content__text">Hall #45</p>
                    <p class="session__content__text">22.08.2022 10:25</p>
                    <p class="session__content__text">10.5$</p>
                </div>
            </div>

        </div>
        <div class="page-card col-xxl-3 col-xl-4 col-md-6">
            <div class="session">
                <div class="session__content">
                    <p class="session__content__film">Interstellar</p>
                    <p class="session__content__text">Hall #45</p>
                    <p class="session__content__text">22.08.2022 10:25</p>
                    <p class="session__content__text">10.5$</p>
                </div>
            </div>

        </div>
    </#if>
</@base.layout>