package org.fundacionjala.pivotal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.net.PortUnreachableException;

/**
 * Created by Administrator on 5/25/2017.
 */
public class SignIn extends AbstractBasePage {
  @FindBy(id = "credentials_username")
  @CacheLookup
  WebElement usernameTextField;

  @FindBy(xpath = ".//*[@id='login_type_check_form']/input[2]")
  @CacheLookup
  WebElement nextButton;

  @FindBy(id = "credentials_password")
  @CacheLookup
  WebElement passwordTextField;

  @FindBy(xpath = ".//*[@id='login_type_check_form']/input")
  @CacheLookup
  WebElement loginButton;
 public SignIn(WebDriver webDriver){
   super(webDriver);
 }

  public void writeMail(String mail) {
    usernameTextField.sendKeys(mail);
  }

  public void writePassword(String password){
   passwordTextField.sendKeys(password);
  }
  public void clickNextButton() {
    nextButton.click();
  }

  public DashBoard clickLoginButton() {
    loginButton.click();
    return new DashBoard(webDriver);
  }

  public void waitForPageElementLoad(){
    WebDriverWait wait = new WebDriverWait(webDriver, 10);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("credentials_username")));
  }


  public String getTitle() {
    return webDriver.getTitle();
  }

  public WebElement getNextButton() {
    return nextButton;
  }

  public void waitForPasswordField() {
    WebDriverWait wait = new WebDriverWait(webDriver,10);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("credentials_password")));
  }
}
