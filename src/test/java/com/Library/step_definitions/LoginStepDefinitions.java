package com.Library.step_definitions;

import com.Library.pages.LoginPage;
import com.Library.utils.ConfigurationReader;
import com.Library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefinitions {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    LoginPage loginPage = new LoginPage();

    @Given("User is on landing page")
    public void user_is_on_landing_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
    }

    @When("user logs in as {string}")
    public void user_logs_in_as(String string) {
        loginPage.login(string);
    }

    @Then("user should see dashboard page")
    public void user_should_see_dashboard_page() {
        String expected = "Library";

        wait.until(ExpectedConditions.titleIs(expected));
        String actual = Driver.getDriver().getTitle();

        Assert.assertEquals("Title is not equal", expected, actual);
        Driver.closeDriver();

    }

    @When("user enters invalid email")
    public void user_enters_invalid_email() {
        loginPage.login("asdf", ConfigurationReader.getProperty("librarian.password"));
    }

    @Then("user should see invalid email message")
    public void user_should_see_invalid_email_message() {
        loginPage.verifyEmailErrorError();
    }

    @When("user enters invalid password")
    public void user_enters_invalid_password() {
        loginPage.login(ConfigurationReader.getProperty("librarian.username"), "alskdjf");
    }

    @Then("user should see wrong email or password message")
    public void user_should_see_wrong_email_or_password_message() {
       loginPage.verifyEmailOrPasswordError();
    }

}
