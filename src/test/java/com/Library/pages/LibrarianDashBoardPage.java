package com.Library.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LibrarianDashBoardPage {

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


}
