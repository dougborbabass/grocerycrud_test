package suporte;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {

    public static String PATH_OUTPUT = "C:\\Users\\douglas.borba\\Desktop\\prova_testes\\prova_sicredi\\Teste Reporte\\";

    public static void tirarScreenShot(WebDriver navegador, String testName) {
        File screenshot = ((TakesScreenshot) navegador).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(PATH_OUTPUT
                    + GetTimestamp.dataHoraParaArquivo()
                    + testName.split("\\{")[0]
                    + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
