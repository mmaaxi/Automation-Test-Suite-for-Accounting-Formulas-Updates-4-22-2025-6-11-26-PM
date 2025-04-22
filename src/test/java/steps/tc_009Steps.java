package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {
    tc_009Page page = new tc_009Page();

    @Given("el usuario ha ingresado a la configuración de fórmulas")
    public void el_usuario_ha_ingresado_a_la_configuracion_de_formulas() {
        page.navigateToFormulaConfiguration();
    }

    @When("el usuario configura una fórmula con sintaxis incorrecta")
    public void el_usuario_configura_una_formula_con_sintaxis_incorrecta() {
        page.enterIncorrectFormulaSyntax();
    }

    @Then("el sistema detecta error en la configuración de la fórmula")
    public void el_sistema_detecta_error_en_la_configuracion_de_la_formula() {
        Assert.assertTrue(page.isFormulaErrorDetected());
    }

    @Given("el sistema ha detectado un error en la configuración de la fórmula")
    public void el_sistema_ha_detectado_un_error_en_la_configuracion_de_la_formula() {
        Assert.assertTrue(page.isFormulaErrorDetected());
    }

    @When("el usuario intenta ejecutar el proceso de actualización de fórmulas")
    public void el_usuario_intenta_ejecutar_el_proceso_de_actualizacion_de_formulas() {
        page.attemptToUpdateFormulas();
    }

    @Then("el sistema rechaza la actualización y muestra un mensaje de error detallado")
    public void el_sistema_rechaza_la_actualizacion_y_muestra_un_mensaje_de_error_detallado() {
        Assert.assertTrue(page.isUpdateRejectedWithErrorMessage());
    }

    @Given("el sistema rechazó la actualización de fórmulas")
    public void el_sistema_rechazo_la_actualizacion_de_formulas() {
        Assert.assertTrue(page.isUpdateRejectedWithErrorMessage());
    }

    @When("el usuario verifica los logs del sistema")
    public void el_usuario_verifica_los_logs_del_sistema() {
        page.checkSystemLogs();
    }

    @Then("se registra la incidencia del error en los logs")
    public void se_registra_la_incidencia_del_error_en_los_logs() {
        Assert.assertTrue(page.isErrorLoggedInSystem());
    }
}