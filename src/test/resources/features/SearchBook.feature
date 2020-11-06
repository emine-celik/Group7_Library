Feature:
  AC5: Verify that the user can Search for a book

  @search
  Scenario: Search a book
    Given user is on the login page
    When user logs in as a librarian
    When user navigates to Books tab
    And user searches for "Elif Safak"
    Then user should see "Elif Safak" on the result table

