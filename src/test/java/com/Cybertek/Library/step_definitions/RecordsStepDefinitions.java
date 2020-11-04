package com.Cybertek.Library.step_definitions;

import com.Cybertek.Library.Pages.BasePage;
import com.Cybertek.Library.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.util.List;

public class RecordsStepDefinitions {

    BasePage basePage = new BasePage();

    @When("user navigates to {string} tab")
    public void user_navigates_to_tab(String tabName) {
        basePage.navigateTo(tabName);
    }


    @Then("user verifies how many records to see at once")
    public void user_verifies_how_many_records_to_see_at_once(List<String> expectedOptions) {
        List<String> actualOptions = BrowserUtils.getElementsText(basePage.recordsDropdownOptions());
        Assert.assertEquals(expectedOptions,actualOptions);

    }



}
