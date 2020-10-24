package com.Library.pages;

import com.Library.utils.Driver;
import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @FindBy(xpath = "//li/a[@id = 'navbarDropdown']")
    private WebElement userLoggedIn;

    @FindBy(xpath = "//div/a[.='Log Out']")
    private WebElement logOutButton;

    /**
     * Uses the userLoggedIn button located
     * clicks on it to open drop-down
     * clicks on logout button
     */
    public void logOut(){
        userLoggedIn.click();
        logOutButton.click();
        verifyTitle();
    }


    /**
     * Asserting title to make sure after logout
     * Page title is Login - Library landing page
     */
    private String expectedTitle = "Login - Library";
    private String actualTitle = Driver.getDriver().getTitle();

    public void verifyTitle(){
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        Assert.assertTrue("Title verification failed, Test failed!!!", expectedTitle.contains(actualTitle));

    }

}
