package com.demoqa.ui.steps;

import com.demoqa.enums.OptionsHomePage;
import com.demoqa.enums.OptionsWidgets;
import com.demoqa.factories.DataFactory;
import com.demoqa.models.DatePickersModel;
import com.demoqa.task.Acces;
import com.demoqa.task.GoTo;
import com.demoqa.task.InteractDatePicker;
import com.demoqa.ui.navigation.OpenBrowser;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.demoqa.ui.Widgets.FIELD_DATE;
import static com.demoqa.ui.Widgets.FIELD_DATE_TIME;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class WidgetsDatePickerSteps {

    private DatePickersModel datePickersModel;

    @Dado("que el {word} ingresa a la pagina demoqa para interactuar con elementos de tipo fecha")
    public void userEntersPage(String actor) {
        theActorCalled(actor).wasAbleTo(
                OpenBrowser.inDemoQa(),
                GoTo.module(OptionsHomePage.WIDGETS.text()),
                Acces.option(OptionsWidgets.DATE_PRICKER.text())
        );
    }

    @Cuando("el realiza la interacción con una fecha {word}")
    public void makeInteractionWithDate(String example) {
        datePickersModel = DataFactory.with(example);
        theActorInTheSpotlight().wasAbleTo(
                InteractDatePicker.withInfo(datePickersModel)
        );
    }

    @Entonces("el puede seleccionar la fecha correctamente")
    public void youCanUseComponentsCorrectly() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(FIELD_DATE).value().isEqualTo(datePickersModel.getDateView()),
                Ensure.that(FIELD_DATE_TIME).value().isEqualTo(datePickersModel.getDateTimeView())
        );
    }
}
