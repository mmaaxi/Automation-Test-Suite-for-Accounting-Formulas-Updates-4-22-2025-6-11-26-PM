package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_001Page;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page page;

    @Given("que estoy en la página de ingreso de datos de movimiento")
    public void abrirPaginaIngresoDatos() {
        page = new tc_001Page(driver);
        page.navegarAPaginaIngresoDatos();
    }

    @When("ingreso los datos de impuestos, descuentos y otros valores")
    public void ingresarDatos() {
        page.ingresarDatosImpuestosDescYOtros();
    }

    @Then("los datos se registran correctamente")
    public void validarRegistroDatos() {
        page.verificarDatosRegistrados();
    }

    @When("ejecuto el proceso de actualización de fórmulas para el campo 'pago'")
    public void ejecutarActualizacionFormula() {
        page.actualizarFormulaPago();
    }

    @Then("la fórmula del campo 'pago' se actualiza correctamente")
    public void validarActualizacionFormula() {
        page.verificarActualizacionFormula();
    }

    @When("reviso el reporte contable")
    public void revisarReporteContable() {
        page.revisarReporteContable();
    }

    @Then("el valor de 'pago' refleja la suma correcta según la nueva fórmula")
    public void validarValorPago() {
        page.verificarValorPagoCorrecto();
    }
}