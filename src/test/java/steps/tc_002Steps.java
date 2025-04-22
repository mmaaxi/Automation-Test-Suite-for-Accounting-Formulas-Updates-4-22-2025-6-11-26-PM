package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_002Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_002Steps {
    
    WebDriver driver = new ChromeDriver();
    tc_002Page page = new tc_002Page(driver);
    
    @Given("^que el usuario ha ingresado varias entradas de IVA incluyendo IVA regular e IVA retenido$")
    public void ingresarEntradasIVA() {
        page.openApplication();
        page.ingresarIVADetails("regular", 100);
        page.ingresarIVADetails("retenido", 50);
    }
    
    @When("^se ejecuta el proceso de actualización de la fórmula para el campo 'IVA Acumulado'$")
    public void actualizarFormulaIVA() {
        page.actualizarFormulaIVA();
    }
    
    @Then("^la fórmula se actualiza correctamente excluyendo el IVA retenido$")
    public void validarActualizacionFormula() {
        page.validarExclusionIVA();
    }
    
    @When("^el usuario genera el Claim Accounting Report$")
    public void generarClaimReport() {
        page.generarReport();
    }
    
    @Then("^el campo 'IVA Acumulado' muestra el cálculo correcto excluyendo IVA retenido$")
    public void validarReporteFinal() {
        page.validarCalculoIVAFinal();
    }
}