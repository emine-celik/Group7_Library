package com.Cybertek.Library.step_definitions;

import com.Cybertek.Library.Pages.EditUsersPage;
import com.Cybertek.Library.Utilities.BrowserUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;


public class EditUsersStepDefinitions {

    EditUsersPage editUsersPage= new EditUsersPage();

    @When("user select Users button")
    public void user_select_users_button() {
        // BrowserUtils.wait(12);
       BrowserUtils.waitForVisibility(editUsersPage.UsersPage,5);
       editUsersPage.UsersPage.click();
        System.out.println("ok");

    }

    @When("user selects librarian option")
    public void user_selects_librarian_option() {
        BrowserUtils.wait(3);
Select select= new Select(editUsersPage.UserGroup);
        BrowserUtils.wait(5);
select.selectByVisibleText("Librarian");
BrowserUtils.wait(3);

    }




    @Then("user should be able to see librarian displayed")
    public void user_should_be_able_to_see_librarian_displayed() {

        Assert.assertTrue("Verification failed!!",editUsersPage.librarianUsers.isDisplayed());

    }
}
