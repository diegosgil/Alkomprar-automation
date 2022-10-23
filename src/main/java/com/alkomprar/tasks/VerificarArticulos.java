package com.alkomprar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.alkomprar.userinterfaces.ConfirmacionCarritoPage.CERRAR_MODAL;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.*;
import static com.alkomprar.userinterfaces.MenuPage.CATEGORIA;
import static com.alkomprar.userinterfaces.MenuPage.PRIMER_SUB_CATEGORIA;
import static com.alkomprar.userinterfaces.ProductosPage.BOTON_VER_DETALLES;
import static com.alkomprar.userinterfaces.ProductosPage.IMAGENES_PRODUCTOS;
import static com.alkomprar.userinterfaces.SeleccionarArticuloPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerificarArticulos implements Task {
    private static String categoria;
    private static String subcategoria;

    public VerificarArticulos(String categoria, String subcategoria){
        this.categoria = categoria;
        this.subcategoria = subcategoria;
    }

    public static Performable elemento(String categoria, String subcategoria) {
        return instrumented(VerificarArticulos.class, categoria, subcategoria);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                MoveMouse.to(CATEGORIA.of(categoria)),
                WaitUntil.the(SUBCATEGORIA_TV_LED, isVisible()),
                Click.on(SUBCATEGORIA_TV_LED),
                WaitUntil.the(RESULTADOS_PAGINA, isClickable()),
                Click.on(RESULTADOS_PAGINA),

                Click.on(RESULTADOS_PAGINA_50),
                Scroll.to(RESULTADOS_PAGINA).andAlignToTop(),
                Click.on(BOTON_VER_DETALLES)

        );
    }
}
