package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Uriel on 11/07/2017.
 */
public class StartPage extends BasePage {
    By btnRegistrar;
    By btnLogin;

    public  StartPage (WebDriver driver) {
        super(driver);
        btnLogin = By.id(id("btn_login"));
        btnRegistrar = By.id(id("btn_registrar"));
    }

    public boolean isDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(drv -> drv.findElement(btnLogin) != null
                || drv.findElement(new LoginPage(drv).btnIniciarSesion) != null
                || drv.findElement(new HomePage(drv).btnChat) != null);
        return driver.findElement(btnLogin).isDisplayed();
    }

    public void login() {
        driver.findElement(btnLogin).click();
    }
}
