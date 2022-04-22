package com.demoqa.enums;

public enum RememberKeys {
    ALERT_BUTTON("Texto de primera alerta"),
    ALERT_TIMMER("Texto de segunda alerta"),
    ALERT_CONFIRM("Texto de tercera alerta"),
    ALERT_NAME("Texto de tercera alerta");

    private final String text;

    RememberKeys(String message) {
        this.text = message;
    }

    public String text() {
        return text;
    }
}
