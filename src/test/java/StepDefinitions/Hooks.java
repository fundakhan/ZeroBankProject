package StepDefinitions;

import Utilities.BaseDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {


    @Before
    public void before(){

        System.out.println("Scenario Started!");
        BaseDriver.getDriver().get("http://zero.webappsecurity.com/login.html");
        BaseDriver.getDriver().manage().window().maximize();

    }
    @After
    public void after(){

        // seneryo hatali ise ekran goruntusunu al
        BaseDriver.getDriver().quit();

    }
}
