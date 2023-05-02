package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DialogContent extends ParentPage {

    public DialogContent(){
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }



     @FindBy(linkText = "More Services")
     private WebElement onlineBankingBtn;

     @FindBy(id = "pay_bills_link")
     private WebElement payBillsBtn;

     @FindBy(linkText = "Add New Payee")
     private WebElement addNewPayeeBtn;

     @FindBy(id = "np_new_payee_name")
     private WebElement payeeNameInput;

     @FindBy(id = "np_new_payee_address")
     private WebElement payeeAddressInput;

     @FindBy(id = "np_new_payee_account")
     private WebElement accountInput;

     @FindBy(id = "add_new_payee")
     private WebElement addBtn;

     @FindBy(id = "alert_content")
     private WebElement successMessage;

     @FindBy(className = "board-header")
     private WebElement makePaymentsMessage;

     @FindBy(xpath = "(//li[@class='dropdown'])[2]")
     private WebElement dropdownLogout;

     @FindBy(linkText = "Logout")
     private WebElement logoutBtn;

     @FindBy(id = "signin_button")
     private WebElement signInButton;

     @FindBy(xpath = "/html/body/script")
     private WebElement alertContainer;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement successfullyTransactionMessage;

     @FindBy(linkText = "Purchase Foreign Currency")
     private WebElement purchaseBtn;

     @FindBy(id = "pc_currency")
     private WebElement currencyDropdown;

     @FindBy(xpath = "//option[@value='CAD']")
     private WebElement optionCad;

     @FindBy(xpath = "//input[@id='pc_amount']")
     private WebElement amountInput;

     @FindBy(id = "pc_inDollars_true")
     private WebElement usdRadioBtn;

     @FindBy(id = "purchase_cash")
     private WebElement purchaseSubmitBtn;

     @FindBy(id = "transfer_funds_link")
     private WebElement transferFundsBtn;

     @FindBy(id = "tf_fromAccountId")
     private WebElement fromAccountSelect;

     @FindBy(id = "tf_toAccountId")
     private WebElement toAccountSelect;

     @FindBy(id = "tf_amount")
     private WebElement transferAmount;

     @FindBy(id = "tf_description")
     private WebElement descriptionInput;

     @FindBy(id = "btn_submit")
     private WebElement continueBtn;

    @FindBy(id = "btn_submit")
    private WebElement submitBtn;

    @FindBy(css = "div[class='alert alert-success']")
    private WebElement successTransaction;




    public void clickOnOnlineBanking(){

     onlineBankingBtn.click();
    }

    public void clickOnPayBills(){

     payBillsBtn.click();
    }

    public void AddNewPayeeAndFillTheInfo(String payeeName, String payeeAddress, String account){
     addNewPayeeBtn.click();
     sendKeysFunction(payeeNameInput,payeeName);
     sendKeysFunction(payeeAddressInput,payeeAddress);
     sendKeysFunction(accountInput,account);
     addBtn.click();
    }

    public void verifyTheResult(String expectedResult){

   // expectedResult = "The new payee Apple was successfully created.";
        assertTrueValidationText(successMessage,expectedResult);

    }

    public void clickOnPurchaseForeignCurrency(){

        clickFunction(purchaseBtn);
    }

    public void selectTheCADAndFillAmount(String currency,String amount){
        selectFunctionByValue(currencyDropdown,currency);
        sendKeysFunction(amountInput,amount);
        clickFunction(usdRadioBtn);
        clickFunction(purchaseSubmitBtn);
    }

    public void verifyTextMessage(){

        String result = "Foreign currency cash was successfully purchased.";
        assertTrueValidationText(successMessage,result);
    }

    public void clickOnTransferFunds(){
        clickFunction(transferFundsBtn);
    }

    public void selectFromToAccountAndToAccountAndFillForm(String fromAccount, String toAccount, String amount, String description ){

        selectFunctionByValue(fromAccountSelect,fromAccount);
        selectFunctionByValue(toAccountSelect,toAccount);
        sendKeysFunction(transferAmount,amount);
        sendKeysFunction(descriptionInput,description);
        clickFunction(continueBtn);
        clickFunction(submitBtn);
    }

    public void verifySubmittedTransaction(){

     //   String result = "You successfully submitted your transaction.";
        Assert.assertTrue(successfullyTransactionMessage.getText().toLowerCase().contains("successfully".toLowerCase()));
    }




}
