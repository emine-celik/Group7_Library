package com.Cybertek.Library.step_definitions;

import com.Cybertek.Library.Pages.SearchPage;
import com.Cybertek.Library.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchStepDefinitions {

    SearchPage searchPage = new SearchPage();

    @When("user navigates to Books tab")
    public void user_navigates_to_books_tab() {
        BrowserUtils.waitForVisibility(searchPage.booksButton,3);
     searchPage.booksButton.click();
    }




    @When("user searches for {string}")
    public void user_searches_for(String string) {

        BrowserUtils.waitForVisibility(searchPage.searchButton,3);
        searchPage.searchButton.sendKeys(string);

    }
    @Then("user should see {string} on the result table")
    public void user_should_see_on_the_result_table(String string) {

        BrowserUtils.wait(4);
        String actualResult=searchPage.authorName.getText().toLowerCase();
        String expectedResult= string.toLowerCase();
        Assert.assertEquals("Verification Failed!!",actualResult,expectedResult);

    }





}
