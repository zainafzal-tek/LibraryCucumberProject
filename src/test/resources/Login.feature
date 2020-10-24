@login @smoke
Feature: As a user I want to be able to login using different roles, and logout

  Background: common steps
    Given User is on landing page

  @parametrized_test
  Scenario: parametrized login
    When user logs in as "librarian"
    Then user should see dashboard page

  Scenario: Invalid login
    When user enters invalid email
    Then user should see invalid email message

  Scenario: Invalid password
    When user enters invalid password
    Then user should see wrong email or password message


