Feature: Login

  Scenario: User logs in as a librarian
    Given user is on the login page
    When user logs in as a librarian
    Then user should see "Test Librarian 13" on the top right corner