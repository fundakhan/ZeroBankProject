package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver;

    public static WebDriver getDriver(){
        // this concept called "Singleton Driver" (we need one driver for every class that's why its called it)

        if (driver == null) { // if driver is null, that means if there is a driver then do this jobs.
            // and then return driver -> why? because of this a webDriver method and there is a return type.
            // always open clean browser we don't want to open new driver again and again. that's why we have
            // driver == null first

            // terminaldeki kirmizi uyari yazilarini kaldirmak icin yaptik
            Logger.getLogger("").setLevel(Level.SEVERE);
            System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY,"Error"); // terminalde ilk basta cikan kirmizi iki satirlik uyari yazisini kaldirmak icin kullandik
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

            WebDriverManager.chromedriver().setup(); // setup kisminda artik eski setproperty yazmamiza gerek kalmadi
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);

            // firefox icin de bu sekilde yapicaz ya da diger browserlar icin aynisi
            //        WebDriverManager.firefoxdriver().setup();
            //        driver = new FirefoxDriver();
        }


        return driver;
    }

    public static void quitDriver() {

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        if (driver != null) { // driver varsa kapat
            // if there is driver the quit
            driver.quit();
            driver = null; //driver in hafizasini bosaltsin
            // if there is not this line then failed coz after quit driver must be null again to open
        }
    }

    public static void wait(int second){

        try {
            Thread.sleep(second* 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
