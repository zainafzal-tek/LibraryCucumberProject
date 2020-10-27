package com.Library.pages;

import com.Library.utils.BrowserUtils;
import com.Library.utils.Driver;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class UsersPage extends BasePage{

    @FindBy(xpath = "//div/h3[.='User Management']")
    private WebElement userManagementHeader;

    @FindBy(className = "btn btn-lg btn-outline btn-primary btn-sm")
    private WebElement addUserButton;

    @FindBy(id = "user_groups")
    private WebElement userGroupSelectDropdown;

    @FindBy(id = "user_status")
    private WebElement userStatusSelectDropdown;

    @FindBy(className = "form-control input-sm input-xsmall input-inline")
    private WebElement showRecordsSelectDropdown;

    @FindBy(className = "form-control input-sm input-small input-inline")
    private WebElement searchBox;

    @FindBy(id = "tbl_users")
    private WebElement userTable;

    public void verifyUserManagementVisible(){
        wait.until(ExpectedConditions.visibilityOf(userManagementHeader));
        Assert.assertTrue("User is not on user management page!!", userManagementHeader.isDisplayed());
    }

    public Select getDropdown(String dropdownName){
        switch (dropdownName){
            case "User Group":
                return BrowserUtils.getSelectDropdown(userGroupSelectDropdown);

            case "User Status":
                return BrowserUtils.getSelectDropdown(userStatusSelectDropdown);

            case "Show Records":
                return BrowserUtils.getSelectDropdown(showRecordsSelectDropdown);

            default:
                throw new RuntimeException("Cannot find dropdown!!!");
        }
    }

}
