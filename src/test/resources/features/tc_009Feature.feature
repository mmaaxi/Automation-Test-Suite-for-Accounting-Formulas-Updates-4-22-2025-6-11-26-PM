Feature: Validar manejo de errores en la configuración de fórmulas

  Scenario: Error en la sintaxis de la fórmula
    Given el usuario ha ingresado a la configuración de fórmulas
    When el usuario configura una fórmula con sintaxis incorrecta
    Then el sistema detecta error en la configuración de la fórmula

  Scenario: Intento de ejecutar actualización de fórmulas con error
    Given el sistema ha detectado un error en la configuración de la fórmula
    When el usuario intenta ejecutar el proceso de actualización de fórmulas
    Then el sistema rechaza la actualización y muestra un mensaje de error detallado

  Scenario: Verificación de registros de error en logs del sistema
    Given el sistema rechazó la actualización de fórmulas
    When el usuario verifica los logs del sistema
    Then se registra la incidencia del error en los logs