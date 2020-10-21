package com.Library.step_definitions;

import com.Library.pages.LoginPage;
import com.Library.utils.ConfigurationReader;
import com.Library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

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
        String expected = "http://library2.cybertekschool.com/#books";
        String actual = Driver.getDriver().getTitle();

        Assert.assertEquals("Title is not equal", expected, actual);
        Driver.closeDriver();

    }


}
