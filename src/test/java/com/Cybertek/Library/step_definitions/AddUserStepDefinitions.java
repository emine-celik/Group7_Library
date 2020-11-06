package com.Cybertek.Library.step_definitions;

import com.Cybertek.Library.Pages.AddUserPage;
import com.Cybertek.Library.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class AddUserStepDefinitions {

AddUserPage addUserPage=new AddUserPage();

    @When("user select Users module")
    public void user_select_users_module() {
        BrowserUtils.waitForVisibility(addUserPage.userBtn, 5);
        addUserPage.clickbtnUser();
    }


    @When("user select  Add User  button")
    public void user_select_add_user_button() {
        BrowserUtils.waitForVisibility(addUserPage.addUserBtn, 5);
        addUserPage.clickbtnAddUSer();
    }


    @When("user adds new user information")
    public void user_adds_new_user_information( Map<String, String> dataTable) {

        String fullName = dataTable.get("Full Name");
        String password = dataTable.get("Password");
        String email = dataTable.get("E-mail");

        System.out.println(fullName + password + email);
        addUserPage.enterFullName(fullName);
        addUserPage.enterPassword(password);
        addUserPage.enterEmail(email);

    }
    @When("user clicks on save changes button")
    public void user_clicks_on_save_changes_button() {
        BrowserUtils.waitForVisibility(addUserPage.saveBtn, 3);
        addUserPage.clickSaveBtn();
    }

    @Then("user see registered name on the table")
    public void user_see_registered_name_on_the_table() {
        BrowserUtils.waitForVisibility(addUserPage.groupName, 3);

        String actual = addUserPage.groupName.getText();
        String expected="ACTIVE";
        Assert.assertEquals(expected, actual);
    }

}
