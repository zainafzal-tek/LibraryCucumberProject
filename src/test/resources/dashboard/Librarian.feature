@librarian_dashboard
Feature: As a librarian, I want to be able to see number of users, books and borrowed books

  Scenario: Viewing Users, books and borrowed books headers
    Given User is on landing page
    When user logs in as "librarian"
    Then Users, Books and borrowed Books should be displayed