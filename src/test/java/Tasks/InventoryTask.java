package Tasks;

import PageObjects.Cadastro;
import PageObjects.InventoryPage;
import Utils.FileOperations;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryTask {
    private WebDriver driver;
    private InventoryPage inventoryPage;
    private Cadastro Cadastro;

    public InventoryTask(WebDriver driver) {
        this.driver = driver;
        inventoryPage = new InventoryPage(driver);
    }

    public void selectItem() {
        inventoryPage.getAutomationPracticeImageLink().click();
        inventoryPage.getAutomationPracticeAddToCart().click();
        inventoryPage.getAutomationPracticeCheckout().click();
        WebElement element = driver.findElement(By.id("summary_products_quantity"));
        String elementval = element.getText();
        Assertions.assertEquals("1 Product",elementval,"Não há itens no carrinho");
        inventoryPage.getAutomationPracticeSummary().click();
            }
    }
