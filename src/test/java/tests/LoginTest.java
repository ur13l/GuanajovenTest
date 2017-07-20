package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.BienvenidaPage;
import pages.LoginPage;
import pages.StartPage;

/**
 * Created by Uriel on 11/07/2017.
 */
public class LoginTest extends AndroidSetup {
    private BienvenidaPage bienvenidaPage;
    private LoginPage loginPage;
    private StartPage startPage;


    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void login() {
        bienvenidaPage = new BienvenidaPage(driver);
        loginPage = new LoginPage(driver);
        startPage = new StartPage(driver);
        if(bienvenidaPage.isDisplayed()) {
            bienvenidaPage.clickButton();
        }
        if (startPage.isDisplayed()) {
            startPage.login();
        }
        if (loginPage.isDisplayed()) {
            loginPage.login();
        }
    }
}
