package com.Cybertek.Library.Pages;

import com.Cybertek.Library.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage  {
    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "(//span[@class='title'])[3]")
    public WebElement booksButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchButton;

    @FindBy(xpath = "//tr/td[4]")
    public WebElement authorName;




}
