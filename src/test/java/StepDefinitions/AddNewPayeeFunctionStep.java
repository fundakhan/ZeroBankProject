package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewPayeeFunctionStep {

    DialogContent dialogContent = new DialogContent();
    @When("User click on Online Banking")
    public void userClickOnOnlineBanking() {

        dialogContent.findAndClick("onlineBankingBtn");
    }

    @Then("User click on Pay Bills")
    public void userClickOnPayBills() {


        dialogContent.findAndClick("payBillsBtn");




    }

    @And("User click on Add New Payee and fill {string} and {string} and {string}")
    public void userClickOnAddNewPayeeAndFillAndAnd(String name, String address, String account) {


        dialogContent.findAndClick("addNewPayeeBtn");
        dialogContent.findAndSend("payeeName",name);
        dialogContent.findAndSend("payeeAddress",address);
        dialogContent.findAndSend("accountInput",account);
        dialogContent.findAndClick("addBtn");

    }

    @Then("User should see successfully message")
    public void userShouldSeeSuccessfullyMessage() {

        dialogContent.findAndContainsText("successMessage","successfully");

    }

    @Then("Click on logout")
    public void clickOnLogout() {

        dialogContent.findAndClick("dropdownLogout");
        dialogContent.findAndClick("logoutBtn");
    }

    @Then("User SignIn again")
    public void userSignInAgain() {

        dialogContent.findAndClick("signInButton");
    }


    @Then("User should see warning message")
    public void userShouldSeeWarningMessage() {

      dialogContent.findAndContainsText("alertContainer","Please");
    }
}
