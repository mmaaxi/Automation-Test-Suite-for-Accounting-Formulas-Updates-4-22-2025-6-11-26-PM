package pages;

import org.openqa.selenium.WebDriver;

public class tc_003Page {

    WebDriver driver;

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarMontoAcumulado(int monto) {
        // código para introducir monto acumulado en el sistema
    }

    public void ingresarMontoReservaActual(int monto) {
        // código para introducir monto reserva actual en el sistema
    }

    public void guardarDatos() {
        // código para guardar los datos ingresados
    }

    public void calcularMontoAcumuladoFolioReserva() {
        // código para ejecutar el proceso de cálculo
    }

    public void verificarCalculoCorrecto(int valorEsperado) {
        // código para verificar que el cálculo fue correcto
    }
    
    public void verificarReporteContableActualizado() {
        // código para verificar el reporte contable
    }

    public void verificarMontoEnReporte(int valorEsperado) {
        // código para verificar el valor mostrado en el reporte
    }
}