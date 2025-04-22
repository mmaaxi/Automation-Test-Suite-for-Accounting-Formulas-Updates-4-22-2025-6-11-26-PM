package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {

    WebDriver driver;

    By ivaEntradaField = By.id("ivaEntrada");
    By actualizarButton = By.id("actualizarFormula");
    By generarReportButton = By.id("generarReport");
    By ivaAcumuladoField = By.id("ivaAcumulado");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openApplication() {
        driver.get("http://testapplication/iva");
    }

    public void ingresarIVADetails(String tipo, int cantidad) {
        driver.findElement(ivaEntradaField).sendKeys(tipo + ":" + cantidad);
    }

    public void actualizarFormulaIVA() {
        driver.findElement(actualizarButton).click();
    }

    public void validarExclusionIVA() {
        // lógica para validar que el IVA retenido es excluido
    }

    public void generarReport() {
        driver.findElement(generarReportButton).click();
    }

    public void validarCalculoIVAFinal() {
        String ivaAcumulado = driver.findElement(ivaAcumuladoField).getText();
        // lógica para validar el cálculo correcto
    }
}