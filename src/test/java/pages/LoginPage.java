package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Uriel on 10/07/2017.
 */
public class LoginPage extends BasePage {
    By etEmail;
    By etPassword;
    By btnIniciarSesion;

    public LoginPage(WebDriver driver) {
        super(driver);
        btnIniciarSesion = By.id(id("btn_iniciar_sesion"));
        etEmail = By.id(id("email_et"));
        etPassword = By.id(id("pass_et"));
    }

    public boolean isDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(drv -> drv.findElement(btnIniciarSesion) != null
                || drv.findElement(new HomePage(drv).btnChat) != null );
        return driver.findElement(btnIniciarSesion).isDisplayed();
    }

    public LoginPage login() {
        driver.findElement(etEmail).sendKeys("juanjoseesva@gmail.com");
        driver.findElement(etPassword).sendKeys("123asdZXC");
        driver.findElement(etPassword).sendKeys("\n");
        waitForVisibilityOf(btnIniciarSesion);
        driver.findElement(btnIniciarSesion).click();
        waitForVisibilityOf(new HomePage(driver).btnChat);
        return new LoginPage(driver);
    }
}
