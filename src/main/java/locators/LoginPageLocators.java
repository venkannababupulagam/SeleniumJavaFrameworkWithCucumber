package locators;

import org.openqa.selenium.By;

public interface LoginPageLocators {

    By USER_NAME = By.xpath("//input[@name='user-name']");
    By PASSWORD = By.xpath("//input[@name='password']");
    By LOGIN_BUTTON = By.xpath("//input[@name='login-button']");
    By PRODUCTS_TITLE = By.xpath("//span[text()='Products']");
    By ERROR_TEXT = By.xpath("//h3[@data-test='error']");
}
