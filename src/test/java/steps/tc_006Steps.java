package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();

    @Given("I have opened the application")
    public void i_have_opened_the_application() {
        page.openApplication();
    }

    @When("I enter negative values in related fields")
    public void i_enter_negative_values_in_related_fields() {
        page.enterNegativeValues();
    }

    @Then("the system registers the negative values without precision loss")
    public void the_system_registers_the_negative_values_without_precision_loss() {
        page.verifyNegativeValuesRegistered();
    }

    @When("I execute the formula update process")
    public void i_execute_the_formula_update_process() {
        page.executeFormulaUpdate();
    }

    @Then("the calculation in 'payment' and 'cumulative VAT' fields handles negative values correctly")
    public void the_calculation_in_fields_handles_negative_values_correctly() {
        page.verifyCorrectCalculation();
    }

    @When("I review the accounting report")
    public void i_review_the_accounting_report() {
        page.reviewAccountingReport();
    }

    @Then("the report reflects adjustments with negative values appropriately")
    public void the_report_reflects_adjustments_with_negative_values_appropriately() {
        page.verifyReportAdjustments();
    }
}