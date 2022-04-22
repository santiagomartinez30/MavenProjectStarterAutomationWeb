package com.demoqa.enums;

public enum OptionsElements {
    WEB_TABLES("Web Tables");

    private final String text;

    OptionsElements(String text) {
        this.text = text;
    }

    public String text() {
        return text;
    }
}
