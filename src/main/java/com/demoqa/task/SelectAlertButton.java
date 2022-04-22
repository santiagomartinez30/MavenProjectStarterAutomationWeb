package com.demoqa.task;

import com.demoqa.enums.RememberKeys;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class SelectAlertButton implements Task {
    private final Target alert;

    public SelectAlertButton(Target alert) {
        this.alert = alert;
    }

    public static SelectAlertButton inScreen(Target alert) {
        return instrumented(SelectAlertButton.class, alert);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(alert.waitingForNoMoreThan(Duration.ofSeconds(7))).andThen(Actions::click)
        );
        Alert movealert = getDriver().switchTo().alert();
        actor.remember(RememberKeys.ALERT_BUTTON.text(), movealert.getText());
        getDriver().switchTo().alert().accept();
    }
}
