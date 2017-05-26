package org.fundacionjala.pivotal.pages;

import org.fundacionjala.pivotal.help.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.Element;

/**
 * Created by Administrator on 5/25/2017.
 */
public class HomePage  {

    @FindBy(xpath = "html/body/div[1]/div/header/div[2]/a[3]")
    @CacheLookup
    WebElement sign_in;
    protected WebDriver webDriver;
    public HomePage(){
        this.webDriver = BrowserFactory.startBrowser("firefox", "https://www.pivotaltracker.com");
        PageFactory.initElements(webDriver, this);
    }
    /**
     *InitSignIn click_signing_link event
     */
    public SignIn click_signin_link() {
        sign_in.click();
        return new SignIn(webDriver);
    }



    public String getTitle() {
        return webDriver.getTitle();
    }

    public WebElement get_SignInButton(){
        return sign_in;
    }
}
