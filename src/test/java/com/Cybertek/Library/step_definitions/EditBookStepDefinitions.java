package com.Cybertek.Library.step_definitions;

import com.Cybertek.Library.Pages.EditBookPage;
import com.Cybertek.Library.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EditBookStepDefinitions {
   EditBookPage editBook = new EditBookPage();

   @When("user tries to make edits")
   public void user_tries_to_make_edits() {
      BrowserUtils.wait(5);
      editBook.edit.click();
      BrowserUtils.wait(5);
      editBook.bookName.clear();
      BrowserUtils.wait(1);
      editBook.bookName.sendKeys("Ask");

      BrowserUtils.wait(3);
      editBook.authorName.clear();
      BrowserUtils.wait(3);
      editBook.authorName.sendKeys("Elif Safak");

      BrowserUtils.wait(5);
      editBook.description.clear();
      BrowserUtils.wait(1);
      editBook.description.sendKeys("I have read this BOOK");
      BrowserUtils.wait(3);
      editBook.saveChanges.click();
   }


   @Then("user should be able to see info edited")
   public void user_should_be_able_to_see_info_edited() {
      String expectedResult= "Elif Safak";
      String actualResult= editBook.editedAuthorName.getText();
      Assert.assertEquals("Actual result is not same wit Expected Result", expectedResult,actualResult);
   }

}
