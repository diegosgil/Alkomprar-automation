package com.alkomprar.stepdefinitions;

import com.alkomprar.tasks.*;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.alkomprar.userinterfaces.CarritoPage.ARTICULOS_CARRITO;
import static com.alkomprar.userinterfaces.MenuPage.CARRITO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FillToCarStepDefinitions {

    ///////PRIMER EVENTO
    @Cuando("{string} quiere comprar un {string} en la seccion {string}")
    public void diegoQuierecomprarUnEnLASeccion(String actor, String articulo, String categoria) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                ComprarMueble.elemento(articulo, categoria)
        );
    }
    @Entonces("comprara {int} mueble filtrando por el menor precio")
    public void compraraMuebleFiltrandoPorElMenorPrecio(int cantidadArticulos) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CARRITO),
                Ensure.that(ARTICULOS_CARRITO).values().hasSize(cantidadArticulos)
        );
    }

    ///////SEGUNDO EVENTO
    @Cuando("{string} quiera verificar los resultados por pagina")
    public void diegoQuieraVerificarLosResultadosPorPagina(String actor) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                VerificarArticulos.elemento(actor)
        );
    }
    @Entonces("debera mostrar {int} unidades de televisores")
    public void deberaMostrarUnidadesDeTelevisores(int cantidadArticulos) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CARRITO),
                Ensure.that(ARTICULOS_CARRITO).values().hasSize(cantidadArticulos)
        );
    }

    ///////TERCER EVENTO
    @Cuando("{string} desee eliminar el {string} del carrito")
    public void diegoDeseeEliminarElDelCarrito(String actor, String articulo) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                EliminarCarrito.elemento(articulo)
        );
    }

    @Entonces("debera mostrar el carrito con {int} articulos")
    public void deberaMostrarElCarritoConArticulos(int cantidadArticulos) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CARRITO),
                Ensure.that(ARTICULOS_CARRITO).values().hasSize(cantidadArticulos)
        );
    }
}
