package utils;

import base.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class SeleniumUtils extends Base {

    Logger logger = LogManager.getLogger(getClass().getName());

    private Base base;

    public SeleniumUtils() {
    }

    public SeleniumUtils(Base base) {
        this.base = base;
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
