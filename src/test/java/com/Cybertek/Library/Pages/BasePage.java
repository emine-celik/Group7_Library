package com.Cybertek.Library.Pages;

import com.Cybertek.Library.Utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }









}
