package StepDefinitions;

import Pages.DialogContent;
import Utilities.BaseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionStep {

    DialogContent dialogContent = new DialogContent();
    @Given("User navigate to Zero Bank website")
    public void userNavigateToZeroBankWebsite() {

        BaseDriver.getDriver().get("http://zero.webappsecurity.com/login.html");
        BaseDriver.getDriver().manage().window().maximize();
    }

    @When("User enter valid username and password")
    public void userEnterValidUsernameAndPassword() {

        dialogContent.findAndSend("username", "username");
        dialogContent.findAndSend("password", "password");

        dialogContent.findAndClick("signInBtn");

        BaseDriver.getDriver().navigate().back();
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {

        dialogContent.findAndContainsText("homePageValidation", "Online Banking");
    }


}
