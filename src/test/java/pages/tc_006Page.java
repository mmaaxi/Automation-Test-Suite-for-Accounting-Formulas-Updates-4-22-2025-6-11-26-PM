package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_006Page {

    WebDriver driver;
    WebDriverWait wait;

    // Initialize web elements here
    By discountField = By.id("discount");
    By adjustmentField = By.id("adjustment");
    By paymentField = By.id("payment");
    By vatField = By.id("cumulative-vat");
    By formulaUpdateButton = By.id("update-formula");
    By accountingReportLink = By.id("accounting-report");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void openApplication() {
        driver.get("http://application-url.com");
    }

    public void enterNegativeValues() {
        driver.findElement(discountField).sendKeys("-10");
        driver.findElement(adjustmentField).sendKeys("-5");
    }

    public void verifyNegativeValuesRegistered() {
        String discountValue = driver.findElement(discountField).getAttribute("value");
        String adjustmentValue = driver.findElement(adjustmentField).getAttribute("value");
        assert discountValue.equals("-10");
        assert adjustmentValue.equals("-5");
    }

    public void executeFormulaUpdate() {
        driver.findElement(formulaUpdateButton).click();
    }

    public void verifyCorrectCalculation() {
        wait.until(ExpectedConditions.textToBePresentInElementValue(paymentField, "-15"));
        wait.until(ExpectedConditions.textToBePresentInElementValue(vatField, "correct-value")); // Replace with expected value
    }

    public void reviewAccountingReport() {
        driver.findElement(accountingReportLink).click();
    }

    public void verifyReportAdjustments() {
        WebElement reportElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("report-id")));
        assert reportElement.getText().contains("-10");
        assert reportElement.getText().contains("-5");
    }
}