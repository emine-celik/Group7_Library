package com.Cybertek.Library.Pages;


import com.Cybertek.Library.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;


public class BasePage {

    WebDriverWait wait;
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

    public void navigateTo(String tab){
        wait = new WebDriverWait(Driver.getDriver(),10);
        String tabXpath = "//span[text()='"+tab+"']/..";
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(tabXpath))).click();
    }

    @FindBy(xpath = "//select[@class='form-control input-sm input-xsmall input-inline']")
    protected WebElement recordsDropdown;

    public List<WebElement> recordsDropdownOptions(){
        wait.until(ExpectedConditions.visibilityOf(recordsDropdown));
        Select select = new Select(recordsDropdown);
        return select.getOptions();
    }


}