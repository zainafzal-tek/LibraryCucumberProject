@librarian_dashboard @smoke
Feature: As a librarian, I want to be able to see number of users, books and borrowed books

  Background: librarian logging in
    Given User is on landing page
    When user logs in as "librarian"

  Scenario: Viewing Users, books and borrowed books headers
    Then Users, Books and borrowed Books should be displayed

  Scenario: Viewing user management dashboard
    And user clicks on "Users" link
    Then user should see User management page

  Scenario: Viewing Book Management dashboard
    And user clicks on "Books" link
    Then user should see Book management page

    @log_out
  Scenario: User on dashboard wants to logout
    Then user should see dashboard page
    And user should be able see and click logout located under username