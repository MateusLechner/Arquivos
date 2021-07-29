package Tasks;

import PageObjects.Cadastro;
import Utils.FakerGenerator;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;

public class LoginTask {
    private WebDriver driver;
        private Cadastro Cadastro;

    public LoginTask(WebDriver driver){
        this.driver = driver;
        Cadastro = new Cadastro(driver);
    }

    public void realizarCadastro() {
        Cadastro.getEmailTextfield().sendKeys(FakerGenerator.getEmailAdress());
        Cadastro.getAutomationPracticeAccount().click();
        Cadastro.getGender().click();
        Cadastro.getFirstName().sendKeys(FakerGenerator.getFirstName());
        Cadastro.getLastName().sendKeys(FakerGenerator.getLastName());
        Cadastro.getPassword().sendKeys("123456789");
        Cadastro.getDay().click();
        Cadastro.getMonth().click();
        Cadastro.getYear().click();
        Cadastro.getCompanyName().sendKeys("NA");
        Cadastro.getAddress().sendKeys("Estrada para Passo Fundo 67");
        Cadastro.getAddress2().sendKeys("Bairro Passo Fundo, Casa");
        Cadastro.getCity().sendKeys("Guaíba");
        Cadastro.getState().click();
        Cadastro.getPostCode().sendKeys("92730");
        Cadastro.getCountry().click();
        Cadastro.getHomePhone().sendKeys(FakerGenerator.getPhoneNumber());
        Cadastro.getMobilePhone().sendKeys(FakerGenerator.getPhoneNumber());
        Cadastro.getAddressAlias().clear();
        Cadastro.getAddressAlias().sendKeys("Rua Mário Fernandes 570");
        Cadastro.getSubmitButton().click();
    }

}

