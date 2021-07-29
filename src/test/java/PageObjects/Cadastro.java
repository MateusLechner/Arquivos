package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cadastro {
    private WebDriver driver;
    private Waits waits;

    public Cadastro(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }
    public WebElement getAutomationPracticeAccount(){
        return waits.visibilityOfElement(By.id("SubmitCreate"));
    }
    public WebElement getEmailTextfield(){
        return waits.visibilityOfElement(By.name("email_create"));
    }
    public WebElement getGender() {
        return waits.visibilityOfElement(By.name("id_gender"));
    }
    public WebElement getFirstName() {
        return driver.findElement(By.id("customer_firstname"));
    }
    public  WebElement getLastName()  {
        return driver.findElement(By.id("customer_lastname"));
    }
    public WebElement getPassword() {
        return driver.findElement(By.id("passwd"));
    }
    public WebElement getDay()  {
        return driver.findElement(By.xpath("//*[@id=\"days\"]/option[14]"));
    }
    public WebElement getMonth()  {
        return driver.findElement(By.xpath("//*[@id=\"months\"]/option[3]"));
    }
    public WebElement getYear() {
        return driver.findElement(By.xpath("//*[@id=\"years\"]/option[27]"));
    }
    public WebElement getCompanyName() {
        return driver.findElement(By.id("company"));
    }
    public WebElement getAddress() {
        return driver.findElement(By.id("address1"));
    }
    public WebElement getAddress2() {
        return driver.findElement(By.id("address2"));
    }

    public WebElement getCity() {
        return driver.findElement(By.id("city"));
    }
    public WebElement getState() {
        return driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[6]"));
    }
    public WebElement getPostCode() {
        return driver.findElement(By.id("postcode"));
    }
    public WebElement getCountry() {
        return driver.findElement(By.xpath("//*[@id=\"id_country\"]/option[2]"));
    }
    public WebElement getHomePhone() {
        return driver.findElement(By.id("phone"));
    }
    public WebElement getMobilePhone() {
        return driver.findElement(By.id("phone_mobile"));
    }
    public WebElement getAddressAlias() {
        return driver.findElement(By.id("alias"));
    }
    public  WebElement getSubmitButton() {
        return driver.findElement(By.id("submitAccount"));
    }

}
