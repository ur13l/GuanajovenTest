package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Uriel on 10/07/2017.
 */
public class HomePage extends BasePage {
    By btnChat;

    public HomePage(WebDriver driver) {
        super(driver);
        btnChat = By.id(id("boton_chat"));
    }
}
