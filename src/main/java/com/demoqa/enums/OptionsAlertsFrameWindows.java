package com.demoqa.enums;

public enum OptionsAlertsFrameWindows {
    ALERTS("Alerts");

    private final String text;

    OptionsAlertsFrameWindows(String text) {
        this.text = text;
    }

    public String text() {
        return text;
    }
}
