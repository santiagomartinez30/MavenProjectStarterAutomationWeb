package com.demoqa.ui.steps;

import com.demoqa.enums.OptionsAlertsFrameWindows;
import com.demoqa.enums.OptionsHomePage;
import com.demoqa.enums.RememberKeys;
import com.demoqa.enums.TextAlerts;
import com.demoqa.task.*;
import com.demoqa.ui.navigation.OpenBrowser;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.demoqa.enums.TextAlerts.ANSWERALERTCONFIRM;
import static com.demoqa.ui.Alerts.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AlertsSteps {

    @Dado("que el {word} ingresa a la pagina demoqa para interactuar con las diferentes alertas")
    public void userEntersPage(String actor) {
        theActorCalled(actor).wasAbleTo(
                OpenBrowser.inDemoQa(),
                GoTo.module(OptionsHomePage.ALERTS.text()),
                Acces.option(OptionsAlertsFrameWindows.ALERTS.text())
        );
    }

    @Entonces("el puede abrir y cerrar la alerta basica")
    public void closedToAlert() {
        theActorInTheSpotlight().attemptsTo(
                SelectAlertButton.inScreen(BTN_ALERT)
        );
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(TextAlerts.ALERTBUTTON.text()).isEqualTo(theActorInTheSpotlight().recall(RememberKeys.ALERT_BUTTON.text()))
        );
    }

    @Entonces("el puede abrir y cerrar la alerta de tiempo")
    public void closedToAlertTime() {
        theActorInTheSpotlight().attemptsTo(
                SelectAlertButtonTime.inScreen()
        );
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(TextAlerts.ALERTTIMMER.text()).isEqualTo(theActorInTheSpotlight().recall(RememberKeys.ALERT_TIMMER.text()))
        );
    }

    @Entonces("el puede abrir y cerrar la alerta de confirmacion")
    public void closedToAlertConfirm() {
        theActorInTheSpotlight().attemptsTo(
                SelectAlertConfirm.inScreen()
        );
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(TextAlerts.ALERTCONFIRM.text()).isEqualTo(theActorInTheSpotlight().recall(RememberKeys.ALERT_CONFIRM.text())),
                Ensure.that(TEXT_ANSWER_ALERT_CONFIRM).text().isEqualTo(ANSWERALERTCONFIRM.text())
        );
    }

    @Entonces("el puede abrir y cerrar la alerta con el nombre de {word}")
    public void closedToAlertInsertName(String name) {
        theActorInTheSpotlight().attemptsTo(
                SelectAlertInsertName.inScreen(name)
        );
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(TextAlerts.ALERTNAME.text()).isEqualTo(theActorInTheSpotlight().recall(RememberKeys.ALERT_NAME.text())),
                Ensure.that(TEXT_ANSWER_ALERT_PROMT).text().contains(name)
        );
    }
}
