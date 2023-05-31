import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

public class T00_TestBase {
    WebDriver driver;


    @BeforeTest
    public void Setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\python\\FWD\\winjigo_website\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.jumia.com.ng/");
        if (driver.getCurrentUrl().contains("https://www.jumia.com.ng/"))
            //Pass
            System.out.println("Correct Webpage");
        else
            //Fail
            System.out.println("Wrong Webpage");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }



    @AfterTest
    public void close() {

        driver.quit();
    }
}
