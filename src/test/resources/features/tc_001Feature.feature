Feature: Validar actualización de la fórmula en el movimiento 'pago'

  Scenario: Actualización de fórmula de pago con IVA y descuentos
    Given que estoy en la página de ingreso de datos de movimiento
    When ingreso los datos de impuestos, descuentos y otros valores
    Then los datos se registran correctamente
    
    When ejecuto el proceso de actualización de fórmulas para el campo 'pago'
    Then la fórmula del campo 'pago' se actualiza correctamente
    
    When reviso el reporte contable
    Then el valor de 'pago' refleja la suma correcta según la nueva fórmula