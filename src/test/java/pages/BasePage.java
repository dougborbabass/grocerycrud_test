package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver navegador;

    public BasePage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public WebElement mWait(WebElement element) {
        WebDriverWait wait = new WebDriverWait(navegador, 15);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

}
