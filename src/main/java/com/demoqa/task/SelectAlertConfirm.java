package com.demoqa.task;

import com.demoqa.enums.RememberKeys;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static com.demoqa.ui.Alerts.BTN_ALERT_CONFIRM;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class SelectAlertConfirm implements Task {

    public static SelectAlertConfirm inScreen() {
        return instrumented(SelectAlertConfirm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(BTN_ALERT_CONFIRM).silently().isDisplayed(),
                MoveMouse.to(BTN_ALERT_CONFIRM.waitingForNoMoreThan(Duration.ofSeconds(7))).andThen(Actions::click)
        );
        Alert movealert = getDriver().switchTo().alert();
        actor.remember(RememberKeys.ALERT_CONFIRM.text(), movealert.getText());
        getDriver().switchTo().alert().accept();
    }
}
