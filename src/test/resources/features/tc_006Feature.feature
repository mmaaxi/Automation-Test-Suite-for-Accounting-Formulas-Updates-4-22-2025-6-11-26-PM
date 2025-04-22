Feature: Validate behavior with negative values

  Scenario: Validate system behavior with negative values
    Given I have opened the application
    When I enter negative values in related fields
    Then the system registers the negative values without precision loss
    When I execute the formula update process
    Then the calculation in 'payment' and 'cumulative VAT' fields handles negative values correctly
    When I review the accounting report
    Then the report reflects adjustments with negative values appropriately