package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FormularioPage extends BasePage {

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
        navegador.findElement(By.id("form-button-save")).click();
        return this;
    }

    public String capturarMensagemSucesso() {
        return mWait(navegador.findElement(By.xpath("//*[@id=\"report-success\"]/p"))).getText();
    }

    public InicialPage clicarGoBack() {
        navegador.findElement(By.id("save-and-go-back-button")).click();
        return new InicialPage(navegador);
    }

    private void digitarNome(String nome) {
        navegador.findElement(By.id("field-customerName")).sendKeys(nome);
    }

    private void digitarUltimotNome(String utimoNome) {
        navegador.findElement(By.id("field-contactLastName")).sendKeys(utimoNome);
    }

    private void digitarContatoPrimeiroNome(String contatoNome) {
        navegador.findElement(By.id("field-contactFirstName")).sendKeys(contatoNome);
    }

    private void digitarTelefone(String telefone) {
        navegador.findElement(By.id("field-phone")).sendKeys(telefone);
    }

    private void digitarEnderecoL1(String endereco1) {
        navegador.findElement(By.id("field-addressLine1")).sendKeys(endereco1);
    }

    private void digitarEnderecoL2(String endereco2) {
        navegador.findElement(By.id("field-addressLine2")).sendKeys(endereco2);
    }

    private void digitarCidade(String cidade) {
        navegador.findElement(By.id("field-city")).sendKeys(cidade);
    }

    private void digitarEstado(String estado) {
        navegador.findElement(By.id("field-state")).sendKeys(estado);
    }

    private void digitarCep(String cep) {
        navegador.findElement(By.id("field-postalCode")).sendKeys(cep);
    }

    private void digitarPais(String pais) {
        navegador.findElement(By.id("field-country")).sendKeys(pais);
    }

    private void selecionarCompoEmpregador(String empregador) {

        WebElement listaEmpregadores = navegador.findElement(By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]"));
        mWait(listaEmpregadores).click();

        navegador.findElement(By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/div/input")).sendKeys(empregador);
        new Actions(navegador).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

    }

    private void digitarLimiteCredito(int limite) {
        navegador.findElement(By.id("field-creditLimit")).sendKeys(Integer.toString(limite));
    }
}
