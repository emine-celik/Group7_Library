Feature: As user I can choose which User Group to be displayed in the grid ( ie: LIBRARIAN)


    #Given user is on the dashboard page
    #    When user clicks on users module
    #    And user select clicks on categories tab under User Group


@user
  Scenario: Displayed to librarian users categories
    Given user is on the login page
    And user logs in as a librarian
    When user select Users button
    And user selects librarian option
    Then user should be able to see librarian displayed


