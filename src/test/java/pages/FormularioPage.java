package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FormularioPage extends BasePage {

    @FindBy(id = "form-button-save")
    WebElement btnSalvar;
    @FindBy(xpath = "//*[@id=\"report-success\"]/p")
    WebElement msgStatus;
    @FindBy(id = "save-and-go-back-button")
    WebElement btnGoBack;
    @FindBy(id = "field-customerName")
    WebElement campoNome;
    @FindBy(id = "field-contactLastName")
    WebElement campoUltimoNome;
    @FindBy(id = "field-contactFirstName")
    WebElement campoContatoNome;
    @FindBy(id = "field-phone")
    WebElement campoTelefone;
    @FindBy(id = "field-addressLine1")
    WebElement campoEnderecoL1;
    @FindBy(id = "field-addressLine2")
    WebElement campoEnderecoL2;
    @FindBy(id = "field-city")
    WebElement campoCidade;
    @FindBy(id = "field-state")
    WebElement campoEstado;
    @FindBy(id = "field-postalCode")
    WebElement campoCep;
    @FindBy(id = "field-country")
    WebElement campoPais;
    @FindBy(id = "field-creditLimit")
    WebElement campoLimite;
    @FindBy(xpath = "//*[@id=\"field_salesRepEmployeeNumber_chosen\"]")
    WebElement checkBoxEmpregador;
    @FindBy(xpath = "//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/div/input")
    WebElement campoCheckBoxEmpregador;



    public FormularioPage(WebDriver navegador) {
        super(navegador);
    }

    public FormularioPage preencheCadastro(String nome, String utimoNome, String contatoNome,
                                           String telefone, String e1, String e2, String cidade,
                                           String estado, String cep, String pais, String empregador, int limite) {
        digitarNome(nome);
        digitarUltimotNome(utimoNome);
        digitarContatoPrimeiroNome(contatoNome);
        digitarTelefone(telefone);
        digitarEnderecoL1(e1);
        digitarEnderecoL2(e2);
        digitarCidade(cidade);
        digitarEstado(estado);
        digitarCep(cep);
        digitarPais(pais);
        selecionarCompoEmpregador(empregador);
        digitarLimiteCredito(limite);

        return this;
    }


    public FormularioPage clicarSalvar() {
        btnSalvar.click();
        return this;
    }

    public String capturarMensagemSucesso() {
        return mWait(msgStatus).getText();
    }

    public InicialPage clicarGoBack() {
        btnGoBack.click();
        return new InicialPage(navegador);
    }

    private void digitarNome(String nome) {
        campoNome.sendKeys(nome);
    }

    private void digitarUltimotNome(String utimoNome) {
        campoUltimoNome.sendKeys(utimoNome);
    }

    private void digitarContatoPrimeiroNome(String contatoNome) {
        campoContatoNome.sendKeys(contatoNome);
    }

    private void digitarTelefone(String telefone) {
        campoTelefone.sendKeys(telefone);
    }

    private void digitarEnderecoL1(String endereco1) {
        campoEnderecoL1.sendKeys(endereco1);
    }

    private void digitarEnderecoL2(String endereco2) {
        campoEnderecoL2.sendKeys(endereco2);
    }

    private void digitarCidade(String cidade) {
        campoCidade.sendKeys(cidade);
    }

    private void digitarEstado(String estado) {
        campoEstado.sendKeys(estado);
    }

    private void digitarCep(String cep) {
        campoCep.sendKeys(cep);
    }

    private void digitarPais(String pais) {
        campoPais.sendKeys(pais);
    }

    private void selecionarCompoEmpregador(String empregador) {
        mWait(checkBoxEmpregador).click();
        campoCheckBoxEmpregador.sendKeys(empregador);
        new Actions(navegador).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

    }

    private void digitarLimiteCredito(int limite) {
        campoLimite.sendKeys(Integer.toString(limite));
    }
}
