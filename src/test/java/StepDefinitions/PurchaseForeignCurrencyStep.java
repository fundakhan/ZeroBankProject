package StepDefinitions;

import Pages.DialogContent;
import Utilities.BaseDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PurchaseForeignCurrencyStep {

    DialogContent dialogContent = new DialogContent();
    @When("User click on Purchase Foreign Currency")
    public void userClickOnPurchaseForeignCurrency() {

        dialogContent.findAndClick("purchaseBtn");

    }

    @Then("User select the  {string} and fill {string} and select the USD")
    public void userSelectTheAndFillAndSelectTheUSD(String value, String amount) {


        dialogContent.findAndClick("currencyDropdown");
        Select selectCurrency = new Select(BaseDriver.getDriver().findElement(By.id("pc_currency")));
        selectCurrency.selectByValue(value);


        dialogContent.findAndSend("amountInput",amount);
        dialogContent.findAndClick("usdRadioBtn");
        dialogContent.findAndClick("purchaseSubmitBtn");

    }


}
