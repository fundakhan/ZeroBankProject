package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewPayeeFunctionStep {

    DialogContent dialogContent = new DialogContent();
    @When("User click on Online Banking")
    public void userClickOnOnlineBanking() {

        dialogContent.clickOnOnlineBanking();
    }

    @Then("User click on Pay Bills")
    public void userClickOnPayBills() {
        dialogContent.clickOnPayBills();
    }

    @And("User click on Add New Payee and fill {string} and {string} and {string}")
    public void userClickOnAddNewPayeeAndFillAndAnd(String payeeName, String payeeAddress, String account) {
        dialogContent.AddNewPayeeAndFillTheInfo(payeeName,payeeAddress,account);
    }

    @Then("Result should be displayed successfully")
    public void resultShouldBe(String expectedResult) {

        dialogContent.verifyTheResult(expectedResult);
    }
}
