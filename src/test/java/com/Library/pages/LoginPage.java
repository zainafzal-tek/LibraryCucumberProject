package com.Library.pages;

import com.Library.utils.ConfigurationReader;
import com.Library.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;

public class LoginPage extends BasePage {

    @FindBy(id = "inputEmail")
    private WebElement emailInput;

    @FindBy(id = "inputPassword")
    private WebElement passwordInput;

    @FindBy(id = "inputEmail-error")
    private WebElement emailError;

    @FindBy(xpath = "//div/div[.='Sorry, Wrong Email or Password']")
    private WebElement wrongEmailOrPasswordMessage;

    public void login(){
        String email = ConfigurationReader.getProperty("librarian.username");
        String password = ConfigurationReader.getProperty("librarian.password");

        emailInput.sendKeys(email);
        passwordInput.sendKeys(password, Keys.ENTER);

    }

    public void login(String role){

        String emailValue = "";
        String passwordValue = "";

        if (role.equalsIgnoreCase("librarian")){
            emailValue = ConfigurationReader.getProperty("librarian.username");
            passwordValue = ConfigurationReader.getProperty("librarian.password");
        } else {
            emailValue = ConfigurationReader.getProperty("student.username");
            passwordValue = ConfigurationReader.getProperty("student.password");
        }
        emailInput.sendKeys(emailValue);
        passwordInput.sendKeys(passwordValue, Keys.ENTER);

    }

    public void login(String email, String password){
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password, Keys.ENTER);
    }

    public void verifyEmailErrorError(){
        Assert.assertTrue("Login successful. Test failed!!" ,emailError.isDisplayed());
    }

    public void verifyEmailOrPasswordError(){
        Assert.assertTrue("Login successful. Test failed!!", wrongEmailOrPasswordMessage.isDisplayed());
    }

}
