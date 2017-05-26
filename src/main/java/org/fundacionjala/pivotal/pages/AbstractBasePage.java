package org.fundacionjala.pivotal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.fundacionjala.pivotal.help.BrowserFactory;

/**
 * Created by Administrator on 5/26/2017.
 */
public abstract class AbstractBasePage {

  protected WebDriver webDriver;


  /**
   *  HomePage constructor
   */
  public AbstractBasePage(WebDriver webDriver){
    this.webDriver = webDriver;
   // this.webDriver = BrowserFactory.startBrowser("firefox", "https://www.pivotaltracker.com");
    PageFactory.initElements(webDriver, this);
  }


}
