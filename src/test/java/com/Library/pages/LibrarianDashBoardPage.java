package com.Library.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public void verifyHeadersDisplayed() {
        Assert.assertTrue("User header is not displayed!", userHeader.isDisplayed());
        Assert.assertTrue("Books header is not displayed!" , booksHeader.isDisplayed());
        Assert.assertTrue("Borrowed Books header is not displayed!", borrowedBooksHeader.isDisplayed());
    }

    public void verifyLinksDisplayed(){
        Assert.assertTrue("Dashboard link is not displayed!", dashboardLink.isDisplayed());
        Assert.assertTrue("Users link is not displayed!", userLink.isDisplayed());
        Assert.assertTrue("Books link is not displayed!" , booksLink.isDisplayed());
    }

}
