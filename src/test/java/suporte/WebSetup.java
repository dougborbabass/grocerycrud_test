package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebSetup {
    public static WebDriver createChromeSetup() {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Selenium\\drivers\\chrome\\x32_80.0.3987.106\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String url = "https://www.grocerycrud.com/demo/bootstrap_theme";
        navegador.get(url);
        navegador.manage().window().maximize();

        return navegador;
    }
}
