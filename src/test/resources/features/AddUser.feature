Feature: Add User

  User Story 1, AC #1,

  @add_user
  Scenario: Add user as a librarian
    Given user is on the login page
    When user logs in as a librarian
    And user select Users module
    And user select  Add User  button
    When user adds new user information
      | Full Name | Tester    |
      | Password  | Test      |
      | E-mail    | test@test1 |
    And user clicks on save changes button
    Then user see registered name on the table