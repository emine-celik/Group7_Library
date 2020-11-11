@editBook
  Feature: Edit Book
    Agile Story: As a Librarian I should be able to edit books

  # Verify that the user can edit a book after it was created
    Scenario: Librarian should be able to edit on book info
      Given user is on the login page
      When user logs in as a librarian
      When user navigates to "Books" tab
      And user tries to make edits
      Then user should be able to see info edited
