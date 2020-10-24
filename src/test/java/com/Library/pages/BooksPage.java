package com.Library.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BooksPage extends BasePage {

    @FindBy(xpath = "//div/h3[.='Book Management']")
    private WebElement bookManagementHeader;

    public void verifyBookManagementVisible(){
        wait.until(ExpectedConditions.visibilityOf(bookManagementHeader));
        Assert.assertTrue("User is not on Book Management page!!", bookManagementHeader.isDisplayed());
    }

}
