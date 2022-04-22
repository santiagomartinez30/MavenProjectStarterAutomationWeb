package com.demoqa.enums;

public enum TextAlerts {
    ALERTBUTTON("You clicked a button"),
    ALERTTIMMER("This alert appeared after 5 seconds"),
    ALERTCONFIRM("Do you confirm action?"),
    ANSWERALERTCONFIRM("You selected Ok"),
    ALERTNAME("Please enter your name");

    private final String text;

    TextAlerts(String message) {
        this.text = message;
    }

    public String text() {
        return text;
    }

}
