package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TransferFundsFunctionStep {

    DialogContent dialogContent = new DialogContent();
    @When("User click on Transfer Funds")
    public void userClickOnTransferFunds() {
        dialogContent.clickOnTransferFunds();

    }

    @Then("User select {string}, {string} , {string} and {string}")
    public void userSelectAnd(String fromAccount, String toAccount, String amount, String description) {
        dialogContent.selectFromToAccountAndToAccountAndFillForm(fromAccount, toAccount, amount, description);
    }

    @Then("User should see successfully transaction message")
    public void userShouldSeeSuccessfullyTransactionMessage() {
        dialogContent.verifySubmittedTransaction();
    }
}
