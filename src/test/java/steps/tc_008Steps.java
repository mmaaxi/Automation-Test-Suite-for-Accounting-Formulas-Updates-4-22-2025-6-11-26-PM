package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_008Page;

public class tc_008Steps {
    private WebDriver driver;
    private tc_008Page page;

    public tc_008Steps() {
        driver = Hooks.getDriver();
        page = new tc_008Page(driver);
    }

    @Given("I have a large volume of records loaded into the system")
    public void loadLargeVolumeOfRecords() {
        page.loadLargeVolumeOfRecords();
    }

    @When("I execute the formula update process")
    public void executeFormulaUpdateProcess() {
        page.executeFormulaUpdateProcess();
    }

    @Then("the process completes within the expected time with all records correctly calculated")
    public void validateProcessCompletionAndCalculations() {
        page.validateProcessCompletionAndCalculations();
    }

    @Then("the accounting report shows updated calculations without discrepancies")
    public void validateAccountingReport() {
        page.validateAccountingReport();
    }
}