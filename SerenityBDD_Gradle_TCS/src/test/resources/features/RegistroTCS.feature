# language: es

Característica: registro de usuario
  Para realizar el registro de un usuario en demoblaze
  Como cliente de la aplicación
  Quiero Contar con la funcionalidad de registro

  @test @registro
  Escenario: Realizar registro
    Dado Juan es un cliente nuevo de la pagina demoblaze
    Cuando realizo un registro exitoso
    Entonces visualizo ordenes de pago y productos de la tienta para comprar

