package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_003Page;

public class tc_003Steps {

    WebDriver driver;
    tc_003Page page;

    public tc_003Steps() {
        this.driver = Hooks.getDriver();
        this.page = PageFactory.initElements(driver, tc_003Page.class);
    }

    @Given("que ingreso los valores para 'monto acumulado' y 'monto reserva actual'")
    public void ingresarValoresMonto() {
        page.ingresarMontoAcumulado(1000);
        page.ingresarMontoReservaActual(500);
        page.guardarDatos();
    }

    @When("ejecuto el proceso que calcula la nueva columna 'Monto acumulado Folio Reserva 5401'")
    public void ejecutarProcesoCalculo() {
        page.calcularMontoAcumuladoFolioReserva();
    }

    @Then("se crea y calcula correctamente la nueva columna")
    public void verificarCalculoCorrecto() {
        page.verificarCalculoCorrecto(1500);
    }

    @Then("verifico el reporte contable actualizado")
    public void verificarReporteContable() {
        page.verificarReporteContableActualizado();
    }

    @Then("el reporte muestra el campo 'Monto acumulado Folio Reserva 5401' con el valor correcto")
    public void verificarReporteValorCorrecto() {
        page.verificarMontoEnReporte(1500);
    }
}