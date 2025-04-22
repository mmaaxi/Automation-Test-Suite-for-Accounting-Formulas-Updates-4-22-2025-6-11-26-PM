Feature: Validar la integridad de datos tras actualización de fórmulas

  Scenario: Validar que los datos no relacionados con los cálculos permanezcan intactos tras una actualización de fórmulas
    Given El sistema ha realizado una copia de seguridad de los datos antes de la actualización
    When Se ejecuta el proceso de actualización de fórmulas en los campos "pago" e "IVA Acumulado"
    Then Los datos relacionados con los cálculos se han actualizado correctamente sin errores
    And Los datos no relacionados con los cálculos permanecen intactos al comparar con la copia de seguridad