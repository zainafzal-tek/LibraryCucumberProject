package com.Library.pages;

import com.Library.utils.Driver;
import io.cucumber.java.bs.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @FindBy(xpath = "//title")
    private WebElement titleLoginPage;

    public WebElement getTitle(){
        return titleLoginPage;
    }

}
