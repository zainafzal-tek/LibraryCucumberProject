package com.Library.step_definitions;

import com.Library.pages.BooksPage;
import com.Library.pages.LibrarianDashBoardPage;
import com.Library.pages.LoginPage;
import com.Library.pages.UsersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardStepDefinitions {

    LibrarianDashBoardPage librarianDashBoardPage = new LibrarianDashBoardPage();
    UsersPage usersPage = new UsersPage();
    BooksPage booksPage = new BooksPage();

    @Then("Users, Books and borrowed Books should be displayed")
    public void users_books_and_borrowed_books_should_be_displayed() {
        librarianDashBoardPage.verifyHeadersDisplayed();
    }

    @When("user clicks on {string} link")
    public void user_clicks_on_link(String string) {
        librarianDashBoardPage.clickLink(string);
    }

    @Then("user should see User management page")
    public void user_should_see_user_management_page() {
        usersPage.verifyUserManagementVisible();
    }

    @Then("user should see Book management page")
    public void user_should_see_book_management_page() {
        booksPage.verifyBookManagementVisible();
    }

}
