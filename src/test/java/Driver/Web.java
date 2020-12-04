package Driver;

import Report.ReportFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Web extends ReportFactory {

    private static WebDriver driver = null;

    @Before
    public void initDriver() {
        String clientName = "chrome";
        switch (clientName.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "./driverExecFiles/chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "./driverExecFiles/geckodriver");
                driver = new FirefoxDriver();
                break;
            case "sauce":
                // code to implement
                break;
            default:
                new Exception("Invalid client name: " + clientName);
        }
        driver.get("https://clubs3qa1.scholastic.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }


    public byte[] attachScreenShot() {
        return ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES);
    }





}
