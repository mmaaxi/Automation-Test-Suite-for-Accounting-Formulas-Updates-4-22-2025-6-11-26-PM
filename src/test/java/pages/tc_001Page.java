package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {

    WebDriver driver;

    // Locators
    By campoImpuestos = By.id("campoImpuestos");
    By campoDescuentos = By.id("campoDescuentos");
    By botonActualizarFormula = By.id("botonActualizarFormula");
    By botonRevisarReporte = By.id("botonRevisarReporte");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAPaginaIngresoDatos() {
        driver.get("http://example.com/movimiento");
    }

    public void ingresarDatosImpuestosDescYOtros() {
        driver.findElement(campoImpuestos).sendKeys("100");
        driver.findElement(campoDescuentos).sendKeys("50");
    }

    public void verificarDatosRegistrados() {
        // Lógica para verificar que los datos se registraron correctamente
    }

    public void actualizarFormulaPago() {
        driver.findElement(botonActualizarFormula).click();
    }

    public void verificarActualizacionFormula() {
        // Lógica para verificar que la fórmula se actualizó correctamente
    }

    public void revisarReporteContable() {
        driver.findElement(botonRevisarReporte).click();
    }

    public void verificarValorPagoCorrecto() {
        // Lógica para verificar que el valor de 'pago' en el reporte es correcto
    }
}