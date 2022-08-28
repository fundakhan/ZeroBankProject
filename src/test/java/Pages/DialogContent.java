package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent(){
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

     @FindBy(id = "user_login")
     private WebElement username;

     @FindBy(id = "user_password")
     private WebElement password;

     @FindBy(css = "input[value='Sign in']")
     private WebElement signInBtn;

     @FindBy(xpath = "(//div[@class='custom carousel-caption'])[1]")
     private WebElement homePageValidation;

     @FindBy(linkText = "More Services")
     private WebElement onlineBankingBtn;

     @FindBy(id = "pay_bills_link")
     private WebElement payBillsBtn;

     @FindBy(linkText = "Add New Payee")
     private WebElement addNewPayeeBtn;

     @FindBy(id = "np_new_payee_name")
     private WebElement payeeName;

     @FindBy(id = "np_new_payee_address")
     private WebElement payeeAddress;

     @FindBy(id = "np_new_payee_account")
     private WebElement accountInput;

     @FindBy(id = "add_new_payee")
     private WebElement addBtn;

     @FindBy(id = "alert_content")
     private WebElement successMessage;

     @FindBy(xpath = "(//li[@class='dropdown'])[2]")
     private WebElement dropdownLogout;

     @FindBy(linkText = "Logout")
     private WebElement logoutBtn;

     @FindBy(id = "signin_button")
     private WebElement signInButton;

     @FindBy(xpath = "/html/body/script")
     private WebElement alertContainer;

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
     private WebElement fromAccount;

     @FindBy(id = "tf_toAccountId")
     private WebElement toAccount;

     @FindBy(id = "tf_amount")
     private WebElement transferAmount;

     @FindBy(id = "tf_description")
     private WebElement description;

     @FindBy(id = "btn_submit")
     private WebElement continueBtn;

    @FindBy(id = "btn_submit")
    private WebElement submitBtn;

    @FindBy(css = "div[class='alert alert-success']")
    private WebElement successTransaction;










    WebElement myElement;
    public void findAndSend(String strElement, String value){

        switch (strElement){
            case "username":  myElement = username; break;
            case "password":  myElement = password; break;
            case "payeeName":  myElement = payeeName; break;
            case "payeeAddress":  myElement = payeeAddress; break;
            case "accountInput":  myElement = accountInput; break;
            case "amountInput":  myElement = amountInput; break;
            case "transferAmount": myElement = transferAmount; break;
            case "description": myElement = description; break;

        }

        sendKeysFunction(myElement , value);
    }

    public void findAndClick(String strElement){

        switch (strElement){
            case "signInBtn" : myElement = signInBtn; break;
            case "onlineBankingBtn": myElement = onlineBankingBtn; break;
            case "payBillsBtn": myElement = payBillsBtn; break;
            case "addNewPayeeBtn": myElement = addNewPayeeBtn; break;
            case "addBtn": myElement = addBtn; break;
            case "dropdownLogout": myElement = dropdownLogout; break;
            case "logoutBtn": myElement = logoutBtn; break;
            case "signInButton": myElement = signInButton; break;
            case "purchaseBtn": myElement = purchaseBtn; break;
            case "currencyDropdown": myElement = currencyDropdown; break;
            case "optionCad": myElement = optionCad; break;
            case "usdRadioBtn": myElement = usdRadioBtn; break;
            case "purchaseSubmitBtn": myElement = purchaseSubmitBtn; break;
            case "transferFundsBtn": myElement = transferFundsBtn; break;
            case "toAccount": myElement = toAccount; break;
            case "continueBtn": myElement = continueBtn; break;
            case "submitBtn": myElement = submitBtn; break;



        }

        waitUntilLoading();
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement , String text){

        switch (strElement){
            case "homePageValidation" : myElement = homePageValidation; break;
            case "successMessage" : myElement = successMessage; break;
            case "alertContainer" : myElement = alertContainer; break;
            case "successTransaction" : myElement = successTransaction; break;

        }


        verifyContainsText(myElement,text);
    }

    public void searchAndDelete(String searchText){
        findAndSend("searchInput",searchText);
        findAndClick("searchButton");


        waitUntilLoading(); // parent da koydugumuz methodu buraya cagirip bekleme yaptiriyoruz. search button unu calistirdiginda sayfanin yuklenmesi kisminda bekliyor

        findAndClick("deleteButton"); //silme butonuna bas
        findAndClick("deleteDialogBtn"); //dialogdaki silme butununa bas


    }
}
