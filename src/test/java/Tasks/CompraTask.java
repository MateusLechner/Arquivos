package Tasks;

import PageObjects.Cadastro;
import PageObjects.Compra;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompraTask {
    private WebDriver driver;
    private Compra Compra;

    public CompraTask(WebDriver driver) {
        this.driver = driver;
        Compra = new Compra(driver);
    }

    public void realizacompra() {

        Compra.getProceedButton().click();
        Compra.getTerms().click();
        Compra.getShippingButton().click();
        Compra.getPayment().click();
        Compra.getFinish().click();
        WebElement CompraConcluida = driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/span[2]"));
        String compraconcluida = CompraConcluida.getText();
        System.out.printf("%s",compraconcluida);
        Assertions.assertEquals("Order confirmation",compraconcluida,"Compra não concluída");

    }
}