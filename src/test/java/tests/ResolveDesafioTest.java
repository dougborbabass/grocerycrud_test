package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.InicialPage;
import suporte.WebSetup;

import static org.junit.Assert.assertTrue;

public class ResolveDesafioTest {

    private WebDriver navegador;

    @Before
    public void setup() {
        navegador = WebSetup.createChromeSetup();
    }

    @Test
    public void deveResolverDesafio() {
        String mensagemValidacao = new InicialPage(navegador)
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
                .clicarSalvar()
                .capturarMensagemSucesso();
        assertTrue(mensagemValidacao.contains("Your data has been successfully stored into the database."));
    }

    @After
    public void tearDown() {
        navegador.quit();
    }
}
