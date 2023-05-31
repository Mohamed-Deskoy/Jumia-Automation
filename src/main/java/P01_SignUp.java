import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_SignUp extends P00_PageBase {

    public P01_SignUp(WebDriver driver) {
        super(driver);
    }

    public WebElement account() {
        return driver.findElement(By.xpath("//label[contains(text(),\"Account\")]"));

    }

    public WebElement signInButt() {
        return driver.findElement(By.xpath("//a[contains(text(),\"Sign In\")]"));
    }

    public WebElement email() {
        return driver.findElement(By.id("input_identifierValue"));
    }

    public WebElement submit() {
        return driver.findElement(By.xpath("//button[@type=\"submit\"]"));
    }

    public WebElement password() {
        return driver.findElement(By.xpath("//input[@name=\"password\"][@type=\"password\"]"));
    }

    public WebElement confirmPassword() {
        return driver.findElement(By.xpath("//input[@class=\"mdc-text-field__input confirm-password-input\"]"));
    }

    public WebElement continueButtpass() {
        return driver.findElement(By.xpath("//button[@class=\"mdc-button mdc-button--touch mdc-button--raised to-personal-details mdc-ripple-upgraded\"]"));
    }

    public WebElement firstName() {
        return driver.findElement(By.id("input_first_name"));
    }

    public WebElement lastName() {
        return driver.findElement(By.id("input_last_name"));
    }

    public WebElement numPhone() {
        return driver.findElement(By.xpath("//input[@class=\"mdc-text-field__input phone-input\"]"));
    }

    public WebElement continueButtFirst() {
        return driver.findElement(By.xpath("//button[@class=\"mdc-button mdc-button--touch mdc-button--raised to-personal-details-part-2 mdc-ripple-upgraded\"]"));
    }

    public WebElement gender() {
        return driver.findElement(By.id("gender"));
    }

    public WebElement listBox() {
        return driver.findElements(By.cssSelector("ul[class=\"mdc-list mdc-deprecated-list\"][aria-label=\"Gender\"]")).get(0);
    }

    public WebElement BirthDate() {
        return driver.findElement(By.id("input_birth_date"));
    }

    public WebElement contiueAftergender() {
        return driver.findElement(By.id("confirmBtn"));
    }

    public WebElement readConditions() {
        return driver.findElement(By.id("acceptTC"));
    }

    public WebElement typeSubmit() {
        return driver.findElement(By.xpath("//button[@type=\"submit\"]"));
    }


}
