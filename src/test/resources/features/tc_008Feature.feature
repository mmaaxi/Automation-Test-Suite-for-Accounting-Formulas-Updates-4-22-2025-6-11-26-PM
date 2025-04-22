Feature: Validar actualización de fórmulas con grandes volúmenes de datos

  Scenario: Probar procesamiento de grandes volúmenes de datos y actualización de fórmulas
    Given I have a large volume of records loaded into the system
    When I execute the formula update process
    Then the process completes within the expected time with all records correctly calculated
    And the accounting report shows updated calculations without discrepancies