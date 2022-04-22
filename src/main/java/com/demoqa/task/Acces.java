package com.demoqa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.demoqa.ui.Home.MENU_OPTION_SECONDARY;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Acces implements Task {

    private final String nameOption;

    public Acces(String nameOption) {
        this.nameOption = nameOption;
    }

    public static Acces option(String nameOption) {
        return instrumented(Acces.class, nameOption);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(MENU_OPTION_SECONDARY.of(nameOption)).andAlignToTop(),
                Click.on(MENU_OPTION_SECONDARY.of(nameOption))
        );
    }
}
