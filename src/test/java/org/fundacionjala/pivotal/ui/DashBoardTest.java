package org.fundacionjala.pivotal.ui;

import org.fundacionjala.pivotal.pages.DashBoard;
import org.fundacionjala.pivotal.pages.HomePage;
import org.fundacionjala.pivotal.pages.SignIn;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by reinaldo on 26/05/2017.
 */
public class DashBoardTest {
    HomePage initHomePage;
    SignIn initSignIn;
    DashBoard initDastBoard;


    @BeforeClass
    public void beforeClass() {
        initHomePage = new HomePage();
        initSignIn = initHomePage.click_signin_link();
        initSignIn.waitForPageElementLoad();
        initSignIn.writeMail("juan.aitken@fundacion-jala.org");
        initSignIn.clickNextButton();
        initSignIn.waitForPasswordField();
        initSignIn.writePassword("test123456");
        initDastBoard = initSignIn.clickLoginButton();
        initDastBoard.waitForLoadElements();
    }

@Test
    public void verifyPageTitle(){
    Assert.assertEquals(initDastBoard.getTitle(),"Dashboard - Pivotal Tracker");
}
@Test
    public void clickOnCreateProyectButton(){
    initDastBoard.waitForLoadElements();
        initDastBoard.clickOnCreateProyectButton();
}
@Test
    public void writeProjectName(){
        initDastBoard.writeProjectName("Hola123");
}

}
