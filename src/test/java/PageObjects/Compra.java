package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Compra {
    private WebDriver driver;
    private Waits waits;

    public Compra(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }
    public WebElement getProceedButton() {
        return waits.visibilityOfElement(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
    }
    public WebElement getShippingButton() {
        return waits.visibilityOfElement(By.xpath("//*[@id=\"form\"]/p/button"));
    }
    public WebElement getTerms() {
        return waits.visibilityOfElement(By.xpath("//*[@id=\"uniform-cgv\"]"));
    }
    public WebElement getPayment() {
        return waits.visibilityOfElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
    }
    public WebElement getFinish()  {
        return waits.visibilityOfElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
    }
}