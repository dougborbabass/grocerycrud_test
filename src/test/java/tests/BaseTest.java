package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

abstract class BaseTest {

    protected WebDriver navegador;

    @Before
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        navegador = new ChromeDriver(chromeOptions);
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String url = "https://www.grocerycrud.com/demo/bootstrap_theme";
        navegador.get(url);
    }

    @After
    public void teardown() {
        if (navegador != null) {
            navegador.quit();
        }
    }

    protected WebDriver getNavegador() {
        return navegador;
    }
}
