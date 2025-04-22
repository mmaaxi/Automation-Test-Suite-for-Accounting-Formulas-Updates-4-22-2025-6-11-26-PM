Feature: Validar visualización de las actualizaciones en la interfaz del reporte contable

  Scenario: Verificar la actualización y visualización del Claim Accounting Report
    Given el sistema ha completado exitosamente la actualización de fórmulas 
    When el usuario accede a la interfaz del Claim Accounting Report 
    Then la interfaz muestra los nuevos campos y fórmulas actualizadas
    And los valores y cálculos del reporte concuerdan con los datos ingresados