package com.demoqa.ui.navigation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class OpenBrowser implements Task {

    private final DemoQa page = new DemoQa();

    public OpenBrowser() {
    }

    public static OpenBrowser inDemoQa() {
        return Tasks.instrumented(OpenBrowser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
        getDriver().manage().window().maximize();
    }
}
