package steps;

import pages.tc_005Page;
import io.cucumber.java.en.*;

public class tc_005Steps {

    tc_005Page page = new tc_005Page();

    @Given("el usuario ingresa valores iniciales en impuestos y descuentos")
    public void ingresarValoresIniciales() {
        page.openTaxDiscountSection();
        page.setInitialTaxDiscountValues();
    }

    @When("el usuario modifica uno o varios valores en la sección de impuestos")
    public void modificarValoresImpuestos() {
        page.modifyTaxValues();
    }

    @Then("el sistema acepta el cambio sin errores")
    public void validarCambioSinErrores() {
        page.verifyNoErrorsAfterModification();
    }

    @When("el usuario ejecuta la actualización de fórmulas y genera el reporte")
    public void ejecutarActualizacionYGenerarReporte() {
        page.updateFormulasAndGenerateReport();
    }

    @Then("el reporte muestra valores recalculados de acuerdo a la modificación")
    public void validarValoresRecalculadosEnReporte() {
        page.verifyRecalculatedValuesInReport();
    }
}