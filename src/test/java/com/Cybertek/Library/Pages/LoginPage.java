package com.Cybertek.Library.Pages;

import com.Cybertek.Library.Utilities.ConfigurationReader;
import com.Cybertek.Library.Utilities.Driver;
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



    /*
     role = librarian , student, or a random name to login with
     invalidPassword = enter a invalid password.
             This method is overloaded for the intentions of NOT logging in.
             If you wish to login this way you can call from
                        ConfigurationReader.getProperty("password.librarian || password.student")
                        and you will successfully login if this is passed in the invalidAccountPassword
                        otherwise, just use login(String role).

     */
    public void login(String role, String invalidAccountPassword) {

        String user = "";
        String password = "";


        if(role.equalsIgnoreCase("librarian")|| role.equalsIgnoreCase("student")){
            if(role.equalsIgnoreCase("librarian")){
                user = ConfigurationReader.getProperty("username.librarian");
                password = invalidAccountPassword;
            }else if(role.equalsIgnoreCase("student")){
                user = ConfigurationReader.getProperty("username.student");
                password = invalidAccountPassword;
            }
        }else{
            user = role;
            password = invalidAccountPassword;
        }

        userNameInputBox.sendKeys(user);
        passwordInputBox.sendKeys(password, Keys.ENTER);
    }






}
