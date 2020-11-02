package com.Cybertek.Library.Pages;

import com.Cybertek.Library.Utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{


    @FindBy(id = "inputEmail") private WebElement userNameInputBox;
    @FindBy(id = "inputPassword") private WebElement passwordInputBox;

    // in the parameter (role) , enter either "librarian" or "student"
    public void login(String role) {
        String user = "";
        String password = "";

        if (role.equalsIgnoreCase("librarian")) {
            user = ConfigurationReader.getProperty("username.librarian");
            password = ConfigurationReader.getProperty("password.librarian");
        } else if (role.equalsIgnoreCase("student")) {
            user = ConfigurationReader.getProperty("username.student");
            password = ConfigurationReader.getProperty("password.student");
        } else {
            user = null;
            password = null;
            throw new RuntimeException("User is not found");
        }

        userNameInputBox.sendKeys(user);
        passwordInputBox.sendKeys(password, Keys.ENTER);
    }












}
