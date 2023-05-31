import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_Login extends P00_PageBase{
    public P02_Login(WebDriver driver) {
        super(driver);
    }

public WebElement hiname(){
        return driver.findElement(By.xpath("//label[@class=\"trig -df -i-ctr -fs16\"][@for=\"dpdw-login\"]"));
}

public WebElement logoutButt(){
        return driver.findElement(By.className("btn _def -mvs"));
}

}
