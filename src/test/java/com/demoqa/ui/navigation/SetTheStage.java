package com.demoqa.ui.navigation;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SetTheStage {

    @Before
    public void Setup (){
        OnStage.setTheStage(new OnlineCast());
    }
}
