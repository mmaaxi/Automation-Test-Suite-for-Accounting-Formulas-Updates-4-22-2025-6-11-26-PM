package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_010Page;
import utils.DriverFactory;

public class tc_010Steps {
    WebDriver driver;
    tc_010Page page;

    @Before
    public void setUp() {
        driver = DriverFactory.getDriver();
        page = new tc_010Page(driver);
    }

    @Given("el sistema ha completado exitosamente la actualización de fórmulas")
    public void ejecutarActualizacionDeFormulas() {
        boolean isCompleted = page.ejecutarActualizacionYGenerarReporte();
        Assert.assertTrue("La actualización de fórmulas no se completó.", isCompleted);
    }

    @When("el usuario accede a la interfaz del Claim Accounting Report")
    public void accederAInterfazReporte() {
        page.accederAInterfazUsuario();
    }

    @Then("la interfaz muestra los nuevos campos y fórmulas actualizadas")
    public void verificarCamposYFormulasActualizadas() {
        boolean isUpdated = page.verificarActualizacionDeInterfaz();
        Assert.assertTrue("La interfaz no muestra los nuevos campos o fórmulas actualizadas.", isUpdated);
    }

    @Then("los valores y cálculos del reporte concuerdan con los datos ingresados")
    public void verificarValoresYCalculos() {
        boolean isCorrect = page.verificarValoresYCalculos();
        Assert.assertTrue("Los valores y cálculos del reporte no concuerdan con los datos ingresados.", isCorrect);
    }
}