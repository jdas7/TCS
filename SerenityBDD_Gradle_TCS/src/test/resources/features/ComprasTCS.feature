# language: es

Característica: adición de productos a la cesta de compras
  Para realizar una compra en demoblaze
  Como cliente de la aplicación
  Quiero Visualizar los productos que estan a la venta y poderlos añadir al carrito de compras

  @test @buy
  Escenario: Adición de productos a la cesta de compras
    Dado Juan es un cliente que ya se registro en la pagina demoblaze
    Y realizo un login
    Cuando agrego un producto a la cesta de compras
    Entonces puedo visualizar los productos que quiero comprar

