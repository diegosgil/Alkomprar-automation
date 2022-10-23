# language: es
Característica: Fill to car
  Como usuario web
  Quiero llenar el carro con productos del catalogo
  Para adquirirlos en la tienda

  Escenario: Verificar la cantidad de televisores
    Cuando "Diego" quiera verificar los "TV" en la seccion "LED"
    Entonces debera mostrar 50 unidades de televisores

  Escenario: Eliminar el articulo del carrito
    Cuando "Diego" desee eliminar un articulo de la categoria "Cámaras" del carrito
    Entonces debera mostrar el carrito con 0 articulos

  Escenario: Comprar una repisa del menor precio
    Cuando "Diego" quiere comprar una "Repisa" en la seccion "Hogar"
    Entonces comprara 1 repisa filtrando por el menor precio



