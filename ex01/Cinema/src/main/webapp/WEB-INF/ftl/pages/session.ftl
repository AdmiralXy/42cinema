<#import "../layouts/application.ftl" as base>
<#import "../components/modal.ftl" as modal>

<@base.layout; section>
    <#if section="css">
        <link rel="stylesheet" href="${springMacroRequestContext.contextPath}/css/session.css" />
    </#if>
    <#if section="content">
        <div class="col-xl-3 pt-lg-5">
            <div class="session-poster">
                <img class="session-poster__image" src="${springMacroRequestContext.contextPath}/img/placeholder-poster.jpg" alt="none">
            </div>
        </div>
        <div class="col-xl-9 pt-lg-5">
            <div class="session-info">
                <p class="session-info__title">
                    Interstellar: about time
                </p>
                <p class="session-info__rating">
                    2022, 18+
                </p>
                <p class="session-info__description">
                    Sed fringilla risus a lacus iaculis vestibulum. Integer augue quam, mollis a tellus in, posuere maximus dolor. Nullam non malesuada lorem, ac faucibus tellus. Suspendisse porttitor ultricies sollicitudin. Sed id ante ac ex porttitor aliquet vel et justo. Morbi elementum, felis a consectetur rutrum, ex nibh dictum eros, ut consectetur urna mi vel ipsum. Curabitur consequat lectus metus, vitae lobortis dolor tincidunt at. In tempus lacinia purus et congue.
                </p>
            </div>
            <div class="session-hall">
                <p class="session-hall__info">
                    Hall #54, 50 seats
                </p>
                <p class="session-hall__info">
                    22.08.2022 20:25
                </p>
                <p class="session-hall__price">
                    5.5 $
                </p>
            </div>
        </div>
    </#if>
</@base.layout>