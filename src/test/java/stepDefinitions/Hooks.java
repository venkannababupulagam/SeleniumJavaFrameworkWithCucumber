package stepDefinitions;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends Base {
    Logger logger = LogManager.getLogger(getClass().getName());

    /** Implementation of Dependency Injection(Design Pattern)
     * Precondition: The current class should extends to base
     * 1. Create a private class type variable
     * 2. Create an empty default constructor
     * 3. Create an Class argument constructor
     *  That's it now we can access driver from any class :)
     */

    private Base base;

    public Hooks() {
    }

    public Hooks(Base base) {
        this.base = base;
    }

    @Before
    public void initiateBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
