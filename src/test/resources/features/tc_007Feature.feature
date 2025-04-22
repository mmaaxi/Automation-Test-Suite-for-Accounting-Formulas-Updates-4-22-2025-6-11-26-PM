Feature: Validar precisión y redondeo en cálculos

  Scenario: Ingresar valores decimales precisos y verificar cálculos
    Given El usuario está en la página de ingreso de valores fiscales
    When El usuario ingresa valores decimales en los campos de impuestos y montos
    Then El sistema acepta valores decimales sin truncamiento
    When El usuario ejecuta el proceso de actualización de fórmulas
    Then Las fórmulas aplican reglas de redondeo configuradas correctamente
    When El usuario verifica el reporte contable
    Then Los valores mostrados reflejan la precisión esperada y el redondeo correcto