Feature: As a user I want to be able to login using different roles

  @parametrized_test
  Scenario: parametrized login
    Given User is on landing page
    When user logs in as "librarian"
    Then user should see dashboard page