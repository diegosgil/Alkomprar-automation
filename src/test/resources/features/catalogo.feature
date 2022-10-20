# language: es
Característica: Fill to car
  Como usuario web
  Quiero llenar el carro con productos del catalogo
  Para adquirirlos en la tienda

  Escenario: Ver el sofa con el menor precio
    Cuando Diego seleccione la seccion de hogar y se diriga a sofas
    Entonces filtrara por el precio menor el cual lo agregara al carrito

  Escenario: Recoger en tienda fisica
    Cuando Diego quiera recoger el televisor en tienda fisica de su ciudad
    Entonces debera existir como minimo una unidad del articulo deseado en el carrito

  Escenario: Eliminar el articulo del carrito
    Cuando Diego desee eliminar el televisor del carrito
    Entonces debera mostrar el carrito vacio

