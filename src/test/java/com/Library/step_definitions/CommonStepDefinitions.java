package com.Library.step_definitions;

import com.Library.pages.BasePage;
import com.Library.pages.LoginPage;
import io.cucumber.java.en.And;

public class CommonStepDefinitions {

    BasePage basePage = new LoginPage();

    @And("user should be able see and click logout located under username")
    public void user_should_be_able_see_and_click_logout_located_under_username() {
        basePage.logOut();
    }


}
