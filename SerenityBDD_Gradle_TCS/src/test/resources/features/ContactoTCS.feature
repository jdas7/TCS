# language: es

Característica: formulario de contacto
  Para contar con mi información de contacto en la página demoblaze
  Como cliente de la aplicación
  Quiero Visualizar un formulario de actualización de mi información

  @test @contact
  Escenario: Registro de información de contacto
    Dado Juan es un cliente que ya se registro en la pagina demoblaze
    Y realizo un login
    Cuando ingreso y editar mi informacion de contacto
    Entonces puedo continuar realizando mi compra

