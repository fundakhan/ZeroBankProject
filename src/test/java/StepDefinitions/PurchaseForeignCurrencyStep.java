package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PurchaseForeignCurrencyStep {
    DialogContent dialogContent = new DialogContent();
    @When("User click on Purchase Foreign Currency")
    public void userClickOnPurchaseForeignCurrency() {

        dialogContent.clickOnPurchaseForeignCurrency();
    }

    @Then("User select the  {string} and fill {string} and select the USD")
    public void userSelectTheAndFillAndSelectTheUSD(String currency,String amount) {
        dialogContent.selectTheCADAndFillAmount(currency,amount);
    }

    @Then("User should see successfully message")
    public void userShouldSeeSuccessfullyMessage() {

        dialogContent.verifyTextMessage();
    }
}
