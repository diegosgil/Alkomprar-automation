# language: es
Característica: Fill to car
  Como usuario web
  Quiero llenar el carro con productos del catalogo
  Para adquirirlos en la tienda

  Escenario: Comprar un mueble del menor precio
    Cuando "Diego" quiere comprar un "Mueble" en la seccion "Hogar"
    Entonces comprara 1 mueble filtrando por el menor precio

  Escenario: Verificar la cantidad de televisores
    Cuando "Diego" quiera verificar los resultados por pagina
    Entonces debera mostrar 50 unidades de televisores

  Escenario: Eliminar el articulo del carrito
    Cuando "Diego" desee eliminar el "celular" del carrito
    Entonces debera mostrar el carrito con 0 articulos

