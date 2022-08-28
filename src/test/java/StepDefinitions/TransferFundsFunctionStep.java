package StepDefinitions;

import Pages.DialogContent;
import Utilities.BaseDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TransferFundsFunctionStep {

    DialogContent dialogContent = new DialogContent();
    @When("User click on Transfer Funds")
    public void userClickOnTransferFunds() {

       dialogContent.findAndClick("transferFundsBtn");
    }

    @Then("User select {string}, {string} , {string} and {string}")
    public void userSelectAnd(String value1, String value2, String amount, String description) {

        //dialogContent.findAndClick("fromAccount");
        Select select1 = new Select(BaseDriver.getDriver().findElement(By.id("tf_fromAccountId")));
        select1.selectByValue(value1);

        //dialogContent.findAndClick("toAccount");
        Select select2 = new Select(BaseDriver.getDriver().findElement(By.id("tf_toAccountId")));
        select2.selectByValue(value2);


        dialogContent.findAndSend("transferAmount",amount);
        dialogContent.findAndSend("description",description);
        dialogContent.findAndClick("continueBtn");
        dialogContent.findAndClick("submitBtn");


    }

    @Then("User should see successfully transaction message")
    public void userShouldSeeSuccessfullyTransactionMessage() {


        dialogContent.findAndContainsText("successTransaction","successfully");
    }
}
