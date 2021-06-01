# language: es

Característica: logueo de usuario
  Para realizar el login de un usuario en demoblaze
  Como cliente de la aplicación
  Quiero Contar con un formulario de login

  @test @login
  Escenario: Realizar login exitoso
    Dado Juan es un cliente que ya se registro en la pagina demoblaze
    Cuando realizo un login
    Entonces visualizo que realice el login

