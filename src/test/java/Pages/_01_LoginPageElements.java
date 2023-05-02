package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _01_LoginPageElements extends ParentPage {

    public _01_LoginPageElements(){ // Built something for me inside this class (Constructor)
        PageFactory.initElements(BaseDriver.getDriver(),this);
        // PageFactory coming Selenium class. it is a useful class. Then initiate elements.
        // all those elements i am going to store here. then initiate and construct for me.
        // then I provide my driver (BaseDriver.getDriver()) to engage all those elements to do job (sendKey, driver click..).
        // then I say "this". "this" keyword will specify the driver specifically for this element
    }

    @FindBy(xpath = "//a[text()='Zero Bank']")
    private WebElement navigateWebSite;
    @FindBy(id = "user_login")
    private WebElement usernameInput;

    @FindBy(id = "user_password")
    private WebElement passwordInput;

    @FindBy(css = "input[value='Sign in']")
    private WebElement signInBtn;

    @FindBy(xpath = "(//div[@class='custom carousel-caption'])[1]")
    private WebElement homePageValidation;


    public void navigateToWebsite(){
        assertTrueValidationText(navigateWebSite,"Zero Bank");
    }

    public void userEnterValidCredentials(String username, String password){


        sendKeysFunction(usernameInput,username);
        sendKeysFunction(passwordInput,password);
    }

    public void userClickLoginButton(){
        clickFunction(signInBtn);

    }

    public void validateUserSuccessfullyLoggedIn(){
       assertTrueValidationText(homePageValidation,"Online Banking");
    }

}
