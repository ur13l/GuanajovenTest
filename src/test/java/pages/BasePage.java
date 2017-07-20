package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Uriel on 10/07/2017.
 */
public class BasePage {

    protected WebDriver driver;
    protected static final String APP_PACKAGE_NAME = "mx.gob.jovenes.guanajuato:id/";

    public BasePage (WebDriver driver) {
        this.driver = driver;
    }

    protected void waitForVisibilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitForClickabilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected static String id(String textId) {
        return APP_PACKAGE_NAME + textId;
    }
}
