package com.demoqa.enums;

public enum OptionsWidgets {

    DATE_PRICKER("Date Picker");

    private final String text;

    OptionsWidgets(String message) {
        this.text = message;
    }

    public String text() {
        return text;
    }
}
