package TestCases;

import Framework.Report;
import Framework.ReportType;
import Framework.Screenshot;
import Framework.TestBase;
import Tasks.CompraTask;
import Tasks.InventoryTask;
import Tasks.LoginTask;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizaCompraComSucesso extends TestBase {

    private WebDriver driver = getDriver();

    private LoginTask loginTask = new LoginTask(driver);
    private InventoryTask inventoryTask = new InventoryTask(driver);
    private CompraTask CompraTask = new CompraTask(driver);

    @Test
    public void realizarCompraComSucesso(){
        try{
            Report.createTest("Adicionar item ao carrinho", ReportType.SINGLE);
            inventoryTask.selectItem();
            Report.createTest("Cadastrar Usuário", ReportType.SINGLE);
            loginTask.realizarCadastro();
            Report.createTest("Finalizar Compra", ReportType.SINGLE);
            CompraTask.realizacompra();

        }catch (Exception e) {
            Report.log(Status.ERROR, e.getMessage(), Screenshot.fullPageBase64(driver));
        }
    }

}
