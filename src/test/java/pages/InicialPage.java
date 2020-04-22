package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InicialPage extends BasePage {

    public InicialPage(WebDriver navegador) {
        super(navegador);
    }

    public InicialPage mudarComboSelectVersion(String opcao) {
        WebElement comboBoxVersion = navegador.findElement(By.id("switch-version-select"));
        new Select(comboBoxVersion).selectByVisibleText(opcao);
        return this;
    }

    public FormularioPage clicarAddCustomer() {
        WebElement btnAddCustomer = navegador.findElement(By.xpath("//a[@href =\"/demo/bootstrap_theme_v4/add\"]"));

        mWait(btnAddCustomer).click();
        return new FormularioPage(navegador);
    }

    public InicialPage aguardarMsgStored() {
        mWaitHide(navegador.findElement(By.xpath("/html/body/div[3]/span[3]")));
        return this;
    }

    public InicialPage digitarNomePesquisa(String nome) {
        mWait(navegador.findElement(By.id("gcrud-search-form"))).findElement(By.name("customerName")).sendKeys(nome);
        return this;
    }

    public InicialPage clicarCheckBoxLinha() {
        mWait(navegador.findElement(By.id("gcrud-search-form"))).findElement(By.className("select-row")).click();
        return this;
    }

    public InicialPage clicarDelete() {
        mWait(navegador.findElement(By.xpath("//*[@class=\"btn btn-outline-dark delete-selected-button\"]//span"))).click();
        return this;
    }

    public InicialPage confirmarDelete() {
        mWait(navegador.findElement(By.xpath("//button[contains(@class, \"delete-multiple-confirmation\")]"))).click();
        return this;
    }

    public String capturarMensagemSucesso() {
        return mWait(navegador.findElement(By.xpath("//p[contains(.,'data has been successfully deleted')]"))).getText();
    }
}
