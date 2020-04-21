package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InicialPage extends BasePage {

    public InicialPage(WebDriver navegador) {
        super(navegador);
    }

    public InicialPage mudarComboSelectVersion(String opcao){
        WebElement comboBoxVersion = navegador.findElement(By.id("switch-version-select"));
        new Select(comboBoxVersion).selectByVisibleText(opcao);
        return this;
    }

    public FormularioPage clicarAddCustomer(){
        WebElement btnAddCustomer = navegador.findElement(By.xpath("//a[@href =\"/demo/bootstrap_theme_v4/add\"]"));
        WebDriverWait wait = new WebDriverWait(navegador, 10);
        wait.until(ExpectedConditions.visibilityOf(btnAddCustomer));

        btnAddCustomer.click();
        return new FormularioPage(navegador);
    }
}
