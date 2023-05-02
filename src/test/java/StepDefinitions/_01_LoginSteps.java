package StepDefinitions;

import Pages.DialogContent;
import Pages._01_LoginPageElements;
import Utilities.BaseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {


    _01_LoginPageElements lgnP = new _01_LoginPageElements();


    @Given("User navigate to Zero Bank website")
    public void userNavigateToWebsite() {
        lgnP.navigateToWebsite();
    }

    @When("User enter credentials as {string} and {string}")
    public void userEnterCredentialsAsAnd(String username, String password) {
        lgnP.userEnterValidCredentials(username, password);
        lgnP.userClickLoginButton();

        BaseDriver.getDriver().navigate().back();
    }


    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {

        lgnP.validateUserSuccessfullyLoggedIn();

    }

    @Then("User close the website")
    public void userCloseTheWebsite() {
        BaseDriver.quitDriver();
    }
}


