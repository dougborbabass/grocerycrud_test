package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class InicialPage extends BasePage {

    @FindBy(id = "switch-version-select")
    WebElement comboBoxVersao;
    @FindBy(xpath = "//a[@href =\"/demo/bootstrap_theme_v4/add\"]")
    WebElement btnAddCustomer;
    @FindBy(xpath = "/html/body/div[3]/span[3]")
    WebElement spanStored;
    @FindBy(id = "gcrud-search-form")
    WebElement formularioPesquisa;
    @FindBy(xpath = "//*[@class=\"btn btn-outline-dark delete-selected-button\"]//span")
    WebElement btnDelete;
    @FindBy(xpath = "//button[contains(@class, \"delete-multiple-confirmation\")]")
    WebElement btnConfirmDelete;
    @FindBy(xpath = "//p[contains(.,'data has been successfully deleted')]")
    WebElement msgDelete;

    public InicialPage(WebDriver navegador) {
        super(navegador);
    }

    public InicialPage mudarComboSelectVersion(String opcao) {
        new Select(comboBoxVersao).selectByVisibleText(opcao);
        return this;
    }

    public FormularioPage clicarAddCustomer() {
        mWait(btnAddCustomer).click();
        return new FormularioPage(navegador);
    }

    public InicialPage aguardarMsgStored() {
        mWaitHide(spanStored);
        return this;
    }

    public InicialPage digitarNomePesquisa(String nome) {
        mWait(formularioPesquisa).findElement(By.name("customerName")).sendKeys(nome);
        return this;
    }

    public InicialPage clicarCheckBoxLinha() {
        mWait(formularioPesquisa).findElement(By.className("select-row")).click();
        return this;
    }

    public InicialPage clicarDelete() {
        mWait(btnDelete).click();
        return this;
    }

    public InicialPage confirmarDelete() {
        mWait(btnConfirmDelete).click();
        return this;
    }

    public String capturarMensagemSucesso() {
        return mWait(msgDelete).getText();
    }
}
