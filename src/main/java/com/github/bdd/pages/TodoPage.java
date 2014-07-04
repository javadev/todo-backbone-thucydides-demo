package com.github.bdd.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@DefaultUrl("http://localhost:9090/")
public class TodoPage extends PageObject {

    @FindBy(ngModel="loginInfo.username")
    private WebElementFacade userField;

    @FindBy(ngModel="loginInfo.password")
    private WebElementFacade passwordField;

    @FindBy(id="loginButton")
    private WebElementFacade loginButton;

    @WhenPageOpens
    public void waitUntilTitleAppears() {
       userField.waitUntilVisible();
       userField.setWindowFocus();
    }
}
