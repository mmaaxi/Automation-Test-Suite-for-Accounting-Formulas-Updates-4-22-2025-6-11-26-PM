Feature: Validar creación y cálculo de 'Monto acumulado Folio Reserva 5401'

  Scenario: Ingreso y cálculo de valores para 'Monto acumulado Folio Reserva 5401'
    Given que ingreso los valores para 'monto acumulado' y 'monto reserva actual'
    When ejecuto el proceso que calcula la nueva columna 'Monto acumulado Folio Reserva 5401'
    Then se crea y calcula correctamente la nueva columna
    And verifico el reporte contable actualizado
    Then el reporte muestra el campo 'Monto acumulado Folio Reserva 5401' con el valor correcto