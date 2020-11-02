package com.Cybertek.Library.Pages;

import com.Cybertek.Library.Utilities.ConfigurationReader;
import com.Cybertek.Library.Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    @FindBy(id = "inputEmail")
    private WebElement userNameInputBox;

    @FindBy(id = "inputPassword")
    private WebElement passwordInputBox;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // in the parameter (role) , enter either "librarian" or "student"
    public void login(String role) {
        String username = "";
        String password = "";

        if (role.equalsIgnoreCase("librarian")) {
            username = ConfigurationReader.getProperty("username.librarian");
            password = ConfigurationReader.getProperty("password.librarian");
        } else if (role.equalsIgnoreCase("student")) {
            username = ConfigurationReader.getProperty("username.student");
            password = ConfigurationReader.getProperty("password.student");
        } else {
            username = null;
            password = null;
            throw new RuntimeException("User is not found");
        }

        userNameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password, Keys.ENTER);
    }












}
