import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T01_SignUp extends T00_TestBase {
    P00_PageBase pageBase;
    P01_SignUp signin;
    P02_Login login;
    private static void writeDataToInputField(WebDriver driver, WebElement element, String value) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].value = arguments[1];", element, value);
    }

    @Test(priority = 1)
    public void signInPage() throws InterruptedException {
        pageBase = new P00_PageBase(driver);
        signin = new P01_SignUp(driver);
        signin.account().click();
        Thread.sleep(2000);
        signin.signInButt().click();

        String actualUrl = driver.getCurrentUrl();
        System.out.printf(actualUrl + "\n");
        if (actualUrl.contains("en-ng"))
            //Pass
            System.out.println("Correct Sign In page");
        else
            //Fail
            System.out.println("Wrong Sign In page");
        Thread.sleep(5000);

    }

    @Test(priority = 2)
    public void validEmail() throws InterruptedException {
        //input email address on email field


        signin.email().sendKeys("00mohamed00ahmed00@gmail.com");

        WebElement iframe = driver.findElement(By.xpath("//iframe[@title=\"Widget containing a Cloudflare security challenge\"]"));
        driver.switchTo().frame(iframe);
        WebElement checkbox = driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", checkbox);
        driver.switchTo().defaultContent();

        Thread.sleep(3000);
        signin.submit().click();
        Thread.sleep(2000);

    }
    @Test(priority = 3)
    public void vaildfields() throws InterruptedException {
        signin.password().sendKeys("MAN78115@@##");
        signin.confirmPassword().sendKeys("MAN78115@@##");
        signin.continueButtpass().click();
        Thread.sleep(4000);
        signin.firstName().sendKeys("mohamed");
        signin.lastName().sendKeys("Ahmed");
        signin.numPhone().sendKeys("1234567897");
        Thread.sleep(4000);

        signin.gender().click();
        signin.listBox().click();

        signin.BirthDate().clear();
        writeDataToInputField(driver, signin.BirthDate(), "2001-05-11");

        signin.readConditions().click();
        signin.contiueAftergender().click();
        Thread.sleep(4000);
    }

    @Test(priority = 4)
    public void logout() throws InterruptedException {
        login.hiname().click();
        login.logoutButt().click();
        Thread.sleep(1000);
    }

    @Test(priority = 5)
    private void login() throws InterruptedException {
        signin.account().click();
        signin.signInButt().click();
        Thread.sleep(2000);

        signin.email().sendKeys("0mohamed0ahmed0@gmail.com");
        signin.submit().click();
        Thread.sleep(4000);

        signin.password().sendKeys("MAN78115@@##");
        signin.confirmPassword().click();
        Thread.sleep(2000);


    }



}
