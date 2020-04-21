package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.InicialPage;
import suporte.WebSetup;

import java.util.concurrent.TimeUnit;

public class ResolveDesafioTest {

    private WebDriver navegador;

    @Before
    public void setup() {
        navegador = WebSetup.createChromeSetup();
    }

    @Test
    public void deveResolverDesafio() {

        // Mudar o valor da combo Select Version através do id "switch-version-select"
        // Clicar no botão add customer //a[@href ="/demo/bootstrap_theme_v4/add"]
        // Preencher os campos do formulário
        // Clicar no botão save através do id "form-button-save"

        new InicialPage(navegador)
                .mudarComboSelectVersion("Bootstrap V4 Theme")
                .clicarAddCustomer()
                .preencheCadastro(
                        "Teste Sicredi",
                        "Teste",
                        "Douglas Borba",
                        "51 9999-9999",
                        "Av Assis Brasil, 3970",
                        "Torre D",
                        "Porto Alegre",
                        "RS",
                        " 91000-000",
                        "Brasil",
                        "Fixter",
                        200)
                .clicarSalvar();



        // Validar a mensagem "Your data has been successfully stored into the database." //*[@id="report-success"]/p/text()

        // Fechar o browser web
    }

    @After
    public void tearDown() {
//        navegador.quit();
    }
}
