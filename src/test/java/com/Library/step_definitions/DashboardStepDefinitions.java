package com.Library.step_definitions;

import com.Library.pages.LibrarianDashBoardPage;
import com.Library.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardStepDefinitions {

    LibrarianDashBoardPage librarianDashBoardPage = new LibrarianDashBoardPage();

    @Then("Users, Books and borrowed Books should be displayed")
    public void users_books_and_borrowed_books_should_be_displayed() {
        librarianDashBoardPage.verifyHeadersDisplayed();
    }

}
