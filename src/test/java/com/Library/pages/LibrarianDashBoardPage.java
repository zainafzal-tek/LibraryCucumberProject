package com.Library.pages;

import com.Library.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LibrarianDashBoardPage extends BasePage {

    @FindBy(xpath = "//div/h6[.='Users']")
    private WebElement userHeader;

    @FindBy(xpath = "//div/h6[.='Books']")
    private WebElement booksHeader;

    @FindBy(xpath = "//div/h6[.='Borrowed Books']")
    private WebElement borrowedBooksHeader;

    @FindBy(xpath = "//a/span[.='Dashboard']")
    private WebElement dashboardLink;

    @FindBy(xpath = "//a/span[.='Users']")
    private WebElement userLink;

    @FindBy(xpath = "//a/span[.='Books']")
    private WebElement booksLink;

    @FindBy(xpath = "//li/a[@id = 'navbarDropdown']")
    private WebElement userLoggedIn;

    @FindBy(xpath = "//div/a[.='Log Out']")
    private WebElement logOutButton;

    public void logOut(){
        userLoggedIn.click();
        logOutButton.click();
        wait.until(ExpectedConditions.visibilityOf(getTitle()));
        Assert.assertTrue("Logout failed!!!", getTitle().isDisplayed());
    }

    public void verifyHeadersDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(userHeader));
        Assert.assertTrue("User header is not displayed!", userHeader.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(booksHeader));
        Assert.assertTrue("Books header is not displayed!" , booksHeader.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(borrowedBooksHeader));
        Assert.assertTrue("Borrowed Books header is not displayed!", borrowedBooksHeader.isDisplayed());
    }

    public void verifyLinksDisplayed(){
        Assert.assertTrue("Dashboard link is not displayed!", dashboardLink.isDisplayed());
        Assert.assertTrue("Users link is not displayed!", userLink.isDisplayed());
        Assert.assertTrue("Books link is not displayed!" , booksLink.isDisplayed());
    }

    public void clickLink(String linkText){
        if (linkText.equalsIgnoreCase("users")){
            userLink.click();
        } else if (linkText.equalsIgnoreCase("books")){
            booksLink.click();
        } else {
            dashboardLink.click();
        }
    }

}
