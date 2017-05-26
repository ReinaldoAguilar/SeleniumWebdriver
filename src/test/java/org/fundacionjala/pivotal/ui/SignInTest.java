package org.fundacionjala.pivotal.ui;

import org.fundacionjala.pivotal.pages.HomePage;
import org.fundacionjala.pivotal.pages.SignIn;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 5/25/2017.
 */
public class SignInTest {
    HomePage initHomePage;
     SignIn initSignIn;

  @BeforeClass
  public void beforeClass() {
  initHomePage = new HomePage();
  initSignIn = initHomePage.click_signin_link();
  initSignIn.waitForPageElementLoad();

  }

  @Test
  public void verifyTitle() {
    Assert.assertEquals(initSignIn.getTitle(), "Pivotal Tracker - Sign in");

  }

  @Test
  public void verifyIfTheNextButtonIsEnabled(){
    Assert.assertTrue( initSignIn.getNextButton().isEnabled(),"The Button is not Enabled");
  }

  @Test
  public void logInThePage(){
    initSignIn.writeMail("juan.aitken@fundacion-jala.org");
    initSignIn.clickNextButton();
    initSignIn.waitForPasswordField();
    initSignIn.writePassword("test123456");
    initSignIn.clickLoginButton();
  }









  }





  /*@Test
  public void checkValidUser() {
    HomePage page =initHomePage.getHomePage();
    initSignIn = page.click_signin_link();
    initSignIn.waitForUsername();

    initSignIn.getSignIn().writeMail("juan.aitken@fundacion-jala.org");
    initSignIn.getSignIn().clicNext();
    initSignIn.waitForPass();

    initSignIn.getSignIn().writePassword("test123456");
    initSignIn.getSignIn().clickLoginButton();
  }*/

