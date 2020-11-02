package com.Cybertek.Library.step_definitions;

import com.Cybertek.Library.Pages.BasePage;
import com.Cybertek.Library.Pages.LoginPage;
import com.Cybertek.Library.Utilities.ConfigurationReader;
import com.Cybertek.Library.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.filefilter.ConditionalFileFilter;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @When("user logs in as a librarian")
    public void user_logs_in_as_a_librarian() {
        loginPage.login("librarian");
    }
    @Then("user should see {string} on the top right corner")
    public void user_should_see_on_the_top_right_corner(String string) {
        String actualName = basePage.loggedUserAvatarNameText();
        Assert.assertEquals(string, actualName);
    }
}
