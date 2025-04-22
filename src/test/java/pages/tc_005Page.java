package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {

    WebDriver driver;

    // Locators
    private By taxSection = By.id("taxSection");
    private By initialTaxField = By.id("initialTax");
    private By initialDiscountField = By.id("initialDiscount");
    private By modifyTaxButton = By.id("modifyTax");
    private By updateFormulasButton = By.id("updateFormulas");
    private By reportSection = By.id("reportSection");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openTaxDiscountSection() {
        driver.findElement(taxSection).click();
    }

    public void setInitialTaxDiscountValues() {
        driver.findElement(initialTaxField).sendKeys("100");
        driver.findElement(initialDiscountField).sendKeys("10");
    }

    public void modifyTaxValues() {
        driver.findElement(modifyTaxButton).click();
        // Additional actions for modifying values
    }

    public void verifyNoErrorsAfterModification() {
        // Logic to verify no errors present
    }

    public void updateFormulasAndGenerateReport() {
        driver.findElement(updateFormulasButton).click();
    }

    public void verifyRecalculatedValuesInReport() {
        // Logic to verify recalculated values in report
    }
}