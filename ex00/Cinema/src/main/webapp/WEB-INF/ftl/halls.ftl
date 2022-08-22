<#import "layouts/application.ftl" as base>
<#import "components/modal.ftl" as modal>

<@base.layout; section>
    <#if section="css">
        <link rel="stylesheet" href="${springMacroRequestContext.contextPath}/css/halls.css" />
    </#if>
    <#if section="content">
        <div class="col-12 pb-5">
            <@modal.layout name="newHall" description="New hall">
                <form method="POST" action="#" enctype="multipart/form-data">
                    <div class="mb-3">
                        <div class="form-floating">
                            <input type="number" class="form-control" name="serial" id="serial" placeholder="Serial number" required>
                            <label for="title">Serial number</label>
                        </div>
                    </div>
                    <div class="mb-3">
                        <div class="form-floating">
                            <input type="number" class="form-control" name="seats" id="seats" placeholder="Number of seats" required>
                            <label for="seats">Number of seats</label>
                        </div>
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
            </@modal.layout>
        </div>
        <div class="page-card col-xxl-3 col-xl-4 col-md-6">
            <div class="hall">
                <div class="hall__content">
                    <p class="hall__content__serial">Hall #46</p>
                    <p class="hall__content__seats">50 seats</p>
                </div>
            </div>
        </div>
        <div class="page-card col-xxl-3 col-xl-4 col-md-6">
            <div class="hall">
                <div class="hall__content">
                    <p class="hall__content__serial">Hall #1</p>
                    <p class="hall__content__seats">30 seats</p>
                </div>
            </div>
        </div>
        <div class="page-card col-xxl-3 col-xl-4 col-md-6">
            <div class="hall">
                <div class="hall__content">
                    <p class="hall__content__serial">Hall #7</p>
                    <p class="hall__content__seats">27 seats</p>
                </div>
            </div>
        </div>
        <div class="page-card col-xxl-3 col-xl-4 col-md-6">
            <div class="hall">
                <div class="hall__content">
                    <p class="hall__content__serial">Hall #5</p>
                    <p class="hall__content__seats">70 seats</p>
                </div>
            </div>
        </div>
        <div class="page-card col-xxl-3 col-xl-4 col-md-6">
            <div class="hall">
                <div class="hall__content">
                    <p class="hall__content__serial">Hall #11</p>
                    <p class="hall__content__seats">40 seats</p>
                </div>
            </div>
        </div>
        <div class="page-card col-xxl-3 col-xl-4 col-md-6">
            <div class="hall">
                <div class="hall__content">
                    <p class="hall__content__serial">Hall #3</p>
                    <p class="hall__content__seats">10 seats</p>
                </div>
            </div>
        </div>
    </#if>
</@base.layout>