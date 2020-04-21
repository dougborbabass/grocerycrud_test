package tests;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.InicialPage;
import suporte.WebSetup;

import static org.junit.Assert.assertTrue;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "ResolveDesafioTest.csv")
public class ResolveDesafioTest {

    private WebDriver navegador;

    @Before
    public void setup() {
        navegador = WebSetup.createChromeSetup();
    }

    @Test
    public void deveResolverDesafio(@Param(name = "nome")String nome,
                                    @Param(name = "ultimoNome")String ultimoNome,
                                    @Param(name = "contatoNome")String contatoNome,
                                    @Param(name = "telefone")String telefone,
                                    @Param(name = "enderecoL1")String enderecoL1,
                                    @Param(name = "enderecoL2")String enderecoL2,
                                    @Param(name = "cidade")String cidade,
                                    @Param(name = "estado")String estado,
                                    @Param(name = "cep")String cep,
                                    @Param(name = "pais")String pais,
                                    @Param(name = "empregador")String empregador,
                                    @Param(name = "limite")int limite,
                                    @Param(name = "mensagemSucesso")String mensagemSucesso) {
        String mensagemValidacao = new InicialPage(navegador)
                .mudarComboSelectVersion("Bootstrap V4 Theme")
                .clicarAddCustomer()
                .preencheCadastro(
                        nome,
                        ultimoNome,
                        contatoNome,
                        telefone,
                        enderecoL1,
                        enderecoL2,
                        cidade,
                        estado,
                        cep,
                        pais,
                        empregador,
                        limite)
                .clicarSalvar()
                .capturarMensagemSucesso();
        assertTrue(mensagemValidacao.contains(mensagemSucesso));
    }

    @After
    public void tearDown() {
//        navegador.quit();
    }
}
