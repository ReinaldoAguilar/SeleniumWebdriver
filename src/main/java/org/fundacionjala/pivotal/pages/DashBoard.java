package org.fundacionjala.pivotal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 5/25/2017.
 */
public class DashBoard extends AbstractBasePage {
  @FindBy(id = "ProjectsPaneUpdated OpenCreateProjectModal-button")
  @CacheLookup
  WebElement createProyectButton;

  @FindBy(xpath = ".//*[@id='modal_area']/div/div[2]/div/form/div/div/div[1]/label/input")
  @CacheLookup
  WebElement nameProyect;

  @FindBy(xpath = ".//*[@id='modal_area']/div/div[2]/div/form/div/div/fieldset/div/div[2]/div[1]/ul/li/span[1]/div")
  @CacheLookup
  WebElement selectvalue;

  @FindBy(xpath = ".//*[@id='modal_area']/div/div[2]/div/form/div/div/fieldset/div/div")
  @CacheLookup
  WebElement selectAccount;

  @FindBy(xpath = ".//*[@id='modal_area']/div/div[2]/div/form/div/div/fieldset/div/div[2]/div[1]/ul/li/span[1]/div")
  @CacheLookup
  WebElement account;

  @FindBy(xpath = ".//*[@id='modal_area']/div/div[2]/div/form/footer/button[2]")
  @CacheLookup
  WebElement createButton;
  public DashBoard(WebDriver webDriver){
    super(webDriver);
  }

  public void waitForLoadElements(){
    WebDriverWait wait = new WebDriverWait(webDriver,10);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ProjectsPaneUpdated OpenCreateProjectModal-button")));
  }
  public void clickOnCreateProyectButton(){
    createProyectButton.click();
  }
  public String getTitle() {
    return webDriver.getTitle();
  }

  public void writeProjectName(String name){
    nameProyect.sendKeys(name);
  }
}
