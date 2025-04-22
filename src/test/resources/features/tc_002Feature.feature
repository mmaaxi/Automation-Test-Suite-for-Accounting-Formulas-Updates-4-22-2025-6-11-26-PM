Feature: Validar actualización de la fórmula del 'IVA Acumulado'

  Scenario: Actualizar la fórmula del IVA Acumulado
    Given que el usuario ha ingresado varias entradas de IVA incluyendo IVA regular e IVA retenido
    When se ejecuta el proceso de actualización de la fórmula para el campo 'IVA Acumulado'
    Then la fórmula se actualiza correctamente excluyendo el IVA retenido
    When el usuario genera el Claim Accounting Report
    Then el campo 'IVA Acumulado' muestra el cálculo correcto excluyendo IVA retenido