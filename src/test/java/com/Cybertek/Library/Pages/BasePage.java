package com.Cybertek.Library.Pages;

import com.Cybertek.Library.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    @FindBy(xpath = "//*[@id=\"navbarDropdown\"]/span")
    private WebElement loggedUserAvatarNameElement;

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public String loggedUserAvatarNameText() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return loggedUserAvatarNameElement.getText().trim();
    }
}