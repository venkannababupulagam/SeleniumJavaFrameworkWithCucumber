package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumUtils {

    WebDriver driver;
    Logger logger = LogManager.getLogger(getClass().getName());

    public SeleniumUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUrl(String url) {
        driver.get(url);
        logger.info("Navigated to " + url);
    }

    public void enterText(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
        logger.info("Entered " + text);
    }

    public void clickOnElement(By locator) {
        driver.findElement(locator).click();
        logger.info("clicked on " + locator.toString());
    }

    public boolean isElementDisplayed(By locator) {
        logger.info("Searching for the element to be displayed " + locator.toString());
        return driver.findElement(locator).isDisplayed();
    }
}
