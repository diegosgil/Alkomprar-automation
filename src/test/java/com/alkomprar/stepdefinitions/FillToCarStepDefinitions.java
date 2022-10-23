package com.alkomprar.stepdefinitions;

import com.alkomprar.tasks.*;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.alkomprar.userinterfaces.CarritoPage.ARTICULOS_CARRITO;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.DETALLE_ARTICULO;
import static com.alkomprar.userinterfaces.MenuPage.CARRITO;
import static com.alkomprar.userinterfaces.ProductosPage.LISTA_PRODUCTOS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FillToCarStepDefinitions {

    @Cuando("{string} quiera verificar los {string} en la seccion {string}")
    public void diegoQuieraVerificarLosEnLaSeccion(String actor, String categoria, String subcategoria) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                VerificarArticulos.elemento(categoria, subcategoria)
        );
    }
    @Entonces("debera mostrar {int} unidades de televisores")
    public void deberaMostrarUnidadesDeTelevisores() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(DETALLE_ARTICULO).isDisplayed()
        );
    }

    @Cuando("{string} desee eliminar un articulo de la categoria {string} del carrito")
    public void diegoDeseeEliminarElDelCarrito(String actor, String articulo) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                EliminarCarrito.elemento(articulo)
        );
    }
    @Entonces("debera mostrar el carrito con {int} articulos")
    public void deberaMostrarElCarritoConArticulos(int articulo) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(ARTICULOS_CARRITO).values().hasSize(articulo)
        );
    }

    @Cuando("{string} quiere comprar una {string} en la seccion {string}")
    public void diegoQuierecomprarUnaEnLaSeccion(String actor, String articulo, String categoria) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                ComprarRepisa.elemento(articulo, categoria)
        );
    }
    @Entonces("comprara {int} repisa filtrando por el menor precio")
    public void compraraRepisaFiltrandoPorElMenorPrecio(int articulo) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CARRITO),
                Ensure.that(ARTICULOS_CARRITO).values().hasSize(articulo)
        );
    }
}










