package com.demoqa.task;

import com.demoqa.enums.RememberKeys;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static com.demoqa.ui.Alerts.BTN_ALERT_PROMT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class SelectAlertInsertName implements Task {

    private final String name;

    public SelectAlertInsertName(String name) {
        this.name = name;
    }

    public static SelectAlertInsertName inScreen(String name) {
        return instrumented(SelectAlertInsertName.class, name);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(BTN_ALERT_PROMT.waitingForNoMoreThan(Duration.ofSeconds(7))).andThen(Actions::click)
        );
        Alert movealert = getDriver().switchTo().alert();
        actor.remember(RememberKeys.ALERT_NAME.text(), movealert.getText());
        getDriver().switchTo().alert().sendKeys(name);
        getDriver().switchTo().alert().accept();
    }
}
