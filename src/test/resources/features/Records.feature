Feature:AC4: Verify that the user can pick how many records
        they want to see at once. ( 5, 10, 50, 100, 200, 500 )

  Background: Common Steps
    Given user is on the login page
    And user logs in as a librarian


  Scenario: Records list on users page
    When user navigates to "Users" tab
    Then user verifies how many records to see at once
    |5|
    |10|
    |15|
    |50|
    |100|
    |200|
    |500|


  Scenario: Records list on users page
    When user navigates to "Books" tab
    Then user verifies how many records to see at once
      |5|
      |10|
      |15|
      |50|
      |100|
      |200|
      |500|


