package org.fundacionjala.pivotal.ui;

import org.fundacionjala.pivotal.pages.HomePage;
import org.fundacionjala.pivotal.pages.SignIn;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 5/25/2017.
 */
public class HomePageTest {
    HomePage initHomePage;
    @BeforeClass
    public void beforeClass() {
        initHomePage = new HomePage();
    }
    @Test
    public void verifyHomePageTitle() {
        Assert.assertEquals(initHomePage.getTitle(), "Agile Project Management | Pivotal Tracker");
    }
    @Test
    public void verifyifTheSingInbuttonIsThere(){
        Assert.assertTrue(initHomePage.get_SignInButton().isEnabled());
    }
    @Test
    public void verifyIf_SignInButtonIsClickeable() {
        initHomePage.click_signin_link();
    }



}
