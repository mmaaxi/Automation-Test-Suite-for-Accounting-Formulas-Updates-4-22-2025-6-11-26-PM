import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page page = new tc_004Page();

    @Given("El sistema ha realizado una copia de seguridad de los datos antes de la actualización")
    public void realizarCopiaDeSeguridad() {
        boolean resultado = page.realizarBackupDatos();
        Assert.assertTrue("La copia de seguridad fue exitosa", resultado);
    }

    @When("Se ejecuta el proceso de actualización de fórmulas en los campos {string} e {string}")
    public void ejecutarProcesoDeActualizacion(String campo1, String campo2) {
        boolean resultado = page.ejecutarActualizacionFormulas(campo1, campo2);
        Assert.assertTrue("El proceso se ejecutó sin errores", resultado);
    }

    @Then("Los datos relacionados con los cálculos se han actualizado correctamente sin errores")
    public void verificarDatosActualizadosCorrectamente() {
        boolean resultado = page.verificarActualizacionExitosa();
        Assert.assertTrue("Los cálculos se han actualizado correctamente", resultado);
    }

    @Then("Los datos no relacionados con los cálculos permanecen intactos al comparar con la copia de seguridad")
    public void compararDatosConCopiaDeSeguridad() {
        boolean resultado = page.compararDatosConBackup();
        Assert.assertTrue("Los datos permanecen intactos", resultado);
    }
}