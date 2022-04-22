package com.demoqa.ui.steps;

import com.demoqa.enums.OptionsHomePage;
import com.demoqa.task.*;
import com.demoqa.enums.OptionsElements;
import com.demoqa.factories.PersonFactory;
import com.demoqa.models.PersonModel;
import com.demoqa.ui.navigation.OpenBrowser;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.demoqa.ui.WebTables.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ElementsWebTablesSteps {

    private PersonModel personModel;

    @Dado("que el {word} ingresa a la pagina demoqa para interactuar con una tabla web")
    public void userEntersPage(String actor) {
        theActorCalled(actor).wasAbleTo(
                OpenBrowser.inDemoQa(),
                GoTo.module(OptionsHomePage.ELEMENTS.text()),
                Acces.option(OptionsElements.WEB_TABLES.text())
        );
    }

    @Cuando("el selecciona el registro a {word}")
    public void deleteARecordOfAPersonInTheTable(String code) {
        personModel = PersonFactory.with(code);
        theActorInTheSpotlight().attemptsTo(
                RemovePersonGrid.withData(personModel)
        );
    }

    @Cuando("el {word} informacion solicitada en la tabla")
    public void addANewPersonRecordInTheGrid(String code) {
        personModel = PersonFactory.with(code);
        theActorInTheSpotlight().attemptsTo(
                AddPersoneGrid.withData(personModel)
        );
    }

    @Entonces("el deberia poder agregar el registro")
    public void youShouldSeeThePersonRecordInTheGrid() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(EMAIL_GRID.of(personModel.getEmail())).text().isEqualTo(personModel.getEmail()),
                Ensure.that(FIRST_NAME_GRID.of(personModel.getFirstName())).text().isEqualTo(personModel.getFirstName()),
                Ensure.that(LAST_NAME_GRID.of(personModel.getLastName())).text().isEqualTo(personModel.getLastName()),
                Ensure.that(AGE_GRID.of(personModel.getAge())).text().isEqualTo(personModel.getAge()),
                Ensure.that(SALARY_GRID.of(personModel.getSalary())).text().isEqualTo(personModel.getSalary()),
                Ensure.that(DEPARTMEN_GRID.of(personModel.getDepartment())).text().isEqualTo(personModel.getDepartment())
        );
    }

    @Entonces("el deberia poder eliminar el registro")
    public void youShouldBeAbleToSeeTheGridWithNotRecordRemoved() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(EMAIL_GRID.of(personModel.getEmail())).isNotDisplayed()
        );
    }
}
