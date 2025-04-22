Feature: Validar recalculación dinámica ante cambio en datos de impuesto

  Scenario: Recalcular valores al modificar los datos de impuestos
    Given el usuario ingresa valores iniciales en impuestos y descuentos
    When el usuario modifica uno o varios valores en la sección de impuestos
    Then el sistema acepta el cambio sin errores
    When el usuario ejecuta la actualización de fórmulas y genera el reporte
    Then el reporte muestra valores recalculados de acuerdo a la modificación