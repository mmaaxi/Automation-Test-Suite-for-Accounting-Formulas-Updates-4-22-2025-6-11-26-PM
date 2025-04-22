import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_007Page;
import static org.junit.Assert.*;

public class tc_007Steps {
    WebDriver driver;
    tc_007Page page;

    public tc_007Steps() {
        this.driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc_007Page.class);
    }

    @Given("^El usuario está en la página de ingreso de valores fiscales$")
    public void el_usuario_esta_en_la_pagina_de_ingreso_de_valores_fiscales() {
        page.navigateToTaxEntryPage();
    }

    @When("^El usuario ingresa valores decimales en los campos de impuestos y montos$")
    public void el_usuario_ingresa_valores_decimales() {
        page.enterDecimalValues();
    }

    @Then("^El sistema acepta valores decimales sin truncamiento$")
    public void el_sistema_acepta_valores_decimales_sin_truncamiento() {
        assertTrue(page.isDecimalValuesAccepted());
    }

    @When("^El usuario ejecuta el proceso de actualización de fórmulas$")
    public void el_usuario_ejecuta_proceso_actualizacion_formulas() {
        page.executeFormulaUpdate();
    }

    @Then("^Las fórmulas aplican reglas de redondeo configuradas correctamente$")
    public void las_formulas_aplican_reglas_redondeo_correctamente() {
        assertTrue(page.isRoundingRulesAppliedCorrectly());
    }

    @When("^El usuario verifica el reporte contable$")
    public void el_usuario_verifica_reporte_contable() {
        page.viewAccountingReport();
    }

    @Then("^Los valores mostrados reflejan la precisión esperada y el redondeo correcto$")
    public void los_valores_mostrados_reflejan_precision_y_redondeo_correcto() {
        assertTrue(page.isAccountingReportCorrect());
    }
}