package com.demoqa.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WebTables {

    // Pop up register form
    public static final Target POP_UP_INPUT_FIRST_NAME = Target.the("input first name").located(By.id("firstName"));
    public static final Target POP_UP_INPUT_LAST_NAME = Target.the("input last name").located(By.id("lastName"));
    public static final Target POP_UP_INPUT_EMAIL = Target.the("input email").located(By.id("userEmail"));
    public static final Target POP_UP_INPUT_AGE = Target.the("input age").located(By.id("age"));
    public static final Target POP_UP_INPUT_SALARY = Target.the("input salary").located(By.id("salary"));
    public static final Target POP_UP_INPUT_DEPARTMENT = Target.the("input department").located(By.id("department"));
    public static final Target POP_UP_BTN_SUBMIT = Target.the("submit button").located(By.id("submit"));
    public static final Target BTN_ADD = Target.the("add button").located(By.id("addNewRecordButton"));
    // web table
    public static final String XPATH_DATE_GRID = "//div[contains(text(),'{0}')]";
    public static final Target EMAIL_GRID = Target.the("email in grid").locatedBy(XPATH_DATE_GRID);
    public static final Target FIRST_NAME_GRID = Target.the("first name in grid").locatedBy(XPATH_DATE_GRID);
    public static final Target LAST_NAME_GRID = Target.the("last name in grid").locatedBy(XPATH_DATE_GRID);
    public static final Target AGE_GRID = Target.the("age in grid").locatedBy(XPATH_DATE_GRID);
    public static final Target SALARY_GRID = Target.the("salary in grid").locatedBy(XPATH_DATE_GRID);
    public static final Target DEPARTMEN_GRID = Target.the("department in grid").locatedBy(XPATH_DATE_GRID);
    public static final Target BTN_REMOVE = Target.the("remove button").locatedBy("//div[contains(text(),'{0}')]//parent::div[@class='rt-tr -odd']//descendant::span[contains(@id,'delete-record')]");

    private WebTables() {
    }

}