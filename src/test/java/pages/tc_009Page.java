package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_009Page {
    WebDriver driver;

    By formulaConfigurationArea = By.id("formula_configuration");
    By errorMessageBox = By.id("error_message_box");
    By systemLogArea = By.id("system_log");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToFormulaConfiguration() {
        driver.findElement(formulaConfigurationArea).click();
    }

    public void enterIncorrectFormulaSyntax() {
        // Simulating entering incorrect formula syntax
        driver.findElement(formulaConfigurationArea).sendKeys("=SUM(A1:A10,)");
    }

    public boolean isFormulaErrorDetected() {
        return driver.findElement(errorMessageBox).isDisplayed();
    }

    public void attemptToUpdateFormulas() {
        // Attempt to update
        driver.findElement(By.id("update_button")).click();
    }

    public boolean isUpdateRejectedWithErrorMessage() {
        return driver.findElement(errorMessageBox).isDisplayed() &&
               driver.findElement(errorMessageBox).getText().contains("Error in formula syntax");
    }

    public void checkSystemLogs() {
        driver.findElement(systemLogArea).click();
    }

    public boolean isErrorLoggedInSystem() {
        return driver.findElement(systemLogArea).getText().contains("Error in formula configuration");
    }
}