package com.Cybertek.Library.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditUsersPage extends BasePage {

    @FindBy(xpath = "//span[.='Users']" )
    public WebElement UsersPage;


    @FindBy(xpath = "//select[@id='user_groups']")
    public WebElement UserGroup;


    @FindBy(xpath = "//div[@class='col-md-5 col-sm-5']")
    public WebElement librarianUsers;

    @FindBy(xpath = "//select[@id='user_groups']/option[1]" )
    public WebElement AllUsers;

    @FindBy(xpath = "//select[@id='user_groups']/option[3]")
    public WebElement StudentUsers;

    public void clickbutton() {
        UsersPage.click();
    }
}
