package com.demoqa.enums;

public enum OptionsHomePage {

    ELEMENTS("Elements"),
    WIDGETS("Widgets"),
    ALERTS("Alerts, Frame & Windows");

    private final String text;

    OptionsHomePage(String message) {
        this.text = message;
    }

    public String text() {
        return text;
    }
}
