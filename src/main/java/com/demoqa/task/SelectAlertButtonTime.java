package com.demoqa.task;

import com.demoqa.enums.RememberKeys;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.demoqa.ui.Alerts.BTN_ALERT_TIMMER;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class SelectAlertButtonTime implements Task {

    private final WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(7));

    public static SelectAlertButtonTime inScreen() {
        return instrumented(SelectAlertButtonTime.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(BTN_ALERT_TIMMER.waitingForNoMoreThan(Duration.ofSeconds(7))).andThen(Actions::click)
        );
        wait.until(ExpectedConditions.alertIsPresent());
        Alert movealert = getDriver().switchTo().alert();
        actor.remember(RememberKeys.ALERT_TIMMER.text(), movealert.getText());
        getDriver().switchTo().alert().accept();
    }
}
