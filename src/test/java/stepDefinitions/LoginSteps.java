package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.LoginPageLocators;
import utils.SeleniumUtils;

public class LoginSteps extends Base implements LoginPageLocators {

    SeleniumUtils utils = new SeleniumUtils(driver);

    @Given("Navigate to the Application URL - {string}")
    public void navigate_to_the_application_url(String url) {
        utils.navigateToUrl(url);
    }

    @When("^Enter (.+) and (.+)$")
    public void enter_valid_credentials(String validUserName, String validPassword) {
        utils.enterText(USER_NAME, validUserName);
        utils.enterText(PASSWORD, validPassword);
    }

    @When("Click on Login Button")
    public void click_on_login_button() {
        utils.clickOnElement(LOGIN_BUTTON);
    }

    @Then("Verify that the user is logged in - {string}")
    public void verify_that_the_user_is_logged_in(String isLoggedIn) {
        if (isLoggedIn.equalsIgnoreCase("true")) {
            utils.isElementDisplayed(PRODUCTS_TITLE);
        } else {
            utils.isElementDisplayed(ERROR_TEXT);
        }
    }
}