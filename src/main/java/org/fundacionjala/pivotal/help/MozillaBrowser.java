package org.fundacionjala.pivotal.help;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Administrator on 5/26/2017.
 */
public class MozillaBrowser {
  private static WebDriver webDriver;
  public static  WebDriver getInstance(){
    if(webDriver == null){
      webDriver = new FirefoxDriver();
    }
    return webDriver;
  }
}
