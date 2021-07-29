package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage {
    private WebDriver driver;
    private Waits waits;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }


    public WebElement getAutomationPracticeImageLink(){
        return waits.visibilityOfElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]"));
    }
    public WebElement getAutomationPracticeAddToCart()  {
        return waits.visibilityOfElement(By.name("Submit"));
    }
    public WebElement getAutomationPracticeCheckout() {
        return waits.visibilityOfElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
    }
    public WebElement getAutomationPracticeSummary() {
        return waits.visibilityOfElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
    }
}
