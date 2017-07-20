package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Uriel on 10/07/2017.
 */
public class BienvenidaPage extends BasePage{
    By btnComenzar;

    public BienvenidaPage(WebDriver driver) {
        super(driver);
        btnComenzar = By.id(id("btn_comenzar"));
    }

    public boolean isDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(drv -> drv.findElement(btnComenzar).isDisplayed()
                || drv.findElement(new StartPage(drv).btnLogin).isDisplayed()
                || drv.findElement(new LoginPage(drv).btnIniciarSesion).isDisplayed()
                || drv.findElement(new HomePage(drv).btnChat).isDisplayed() );
        return driver.findElement(btnComenzar).isDisplayed();
    }

    public void clickButton() {
        driver.findElement(btnComenzar).click();
    }

}
