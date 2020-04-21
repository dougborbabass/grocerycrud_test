package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FormularioPage extends BasePage{

    public FormularioPage(WebDriver navegador) {
        super(navegador);
    }

    public FormularioPage digitarNome(String nome){
        navegador.findElement(By.id("field-customerName")).sendKeys(nome);
        return this;
    }

    public FormularioPage digitarUltimotNome(String utimoNome){
        navegador.findElement(By.id("field-contactLastName")).sendKeys(utimoNome);
        return this;
    }

    public FormularioPage digitarContatoPrimeiroNome(String contatoNome){
        navegador.findElement(By.id("field-contactFirstName")).sendKeys(contatoNome);
        return this;
    }

    public FormularioPage digitarTelefone(String telefone){
        navegador.findElement(By.id("field-phone")).sendKeys(telefone);
        return this;
    }

    public FormularioPage digitarEnderecoL1(String endereco1){
        navegador.findElement(By.id("field-addressLine1")).sendKeys(endereco1);
        return this;
    }

    public FormularioPage digitarEnderecoL2(String endereco2){
        navegador.findElement(By.id("field-addressLine2")).sendKeys(endereco2);
        return this;
    }

    public FormularioPage digitarCidade(String cidade){
        navegador.findElement(By.id("field-city")).sendKeys(cidade);
        return this;
    }

    public FormularioPage digitarEstado(String estado){
        navegador.findElement(By.id("field-state")).sendKeys(estado);
        return this;
    }

    public FormularioPage digitarCep(String cep){
        navegador.findElement(By.id("field-postalCode")).sendKeys(cep);
        return this;
    }

    public FormularioPage digitarPais(String pais){
        navegador.findElement(By.id("field-country")).sendKeys(pais);
        return this;
    }

    public FormularioPage selecionarCompoEmpregador(String empregador){

        WebElement listaEmpregadores = navegador.findElement(By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]"));
        mWait(listaEmpregadores).click();

        navegador.findElement(By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/div/input")).sendKeys(empregador);
        new Actions(navegador).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        return this;
    }
}
