package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ParentPage {

WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(20));
WebDriver driver = BaseDriver.getDriver();
    public void sendKeysFunction(WebElement element, String value){
/** 3. asama parent in cagrilan fonksiyonu */
        waitUntilVisible(element);
        element.clear();
        element.sendKeys(value);


    }

    public void waitUntilVisible(WebElement element){

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element){


//        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.getDriver();
//        js.executeScript("arguments[0].scrollIntoView();", element);

    }

    public void clickFunction(WebElement element){

        waitUntilClickable(element);
      //  scrollToElement(element);



    }

    public void waitUntilClickable(WebElement element){

        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }

    public void selectFunctionByValue(WebElement element, String text){
        waitUntilClickable(element);
        Select select = new Select(element);
        select.selectByValue(text);
        waitUntilClickable(element);
    }

    public void assertTrueValidationText(WebElement element, String text){

        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));

    }

    public void waitUntilLoading(){

        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"),0));
    }

    public void waitUntilUrlToBe(){

        wait.until(ExpectedConditions.urlToBe("http://zero.webappsecurity.com/login.html"));
    }
}
