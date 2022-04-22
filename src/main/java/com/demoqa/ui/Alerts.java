package com.demoqa.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Alerts {
    public static final Target BTN_ALERT = Target.the("alert button").located(By.id("alertButton"));
    public static final Target BTN_ALERT_TIMMER = Target.the("alert timmer button").located(By.id("timerAlertButton"));
    public static final Target BTN_ALERT_CONFIRM = Target.the("alert confirm button").located(By.id("confirmButton"));
    public static final Target TEXT_ANSWER_ALERT_CONFIRM = Target.the("answer").located(By.id("confirmResult"));
    public static final Target BTN_ALERT_PROMT = Target.the("alert promt button").located(By.id("promtButton"));
    public static final Target TEXT_ANSWER_ALERT_PROMT = Target.the("answer").located(By.id("promptResult"));

    private Alerts() {
    }
}
