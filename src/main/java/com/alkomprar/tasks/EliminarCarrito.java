package com.alkomprar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.alkomprar.userinterfaces.CarritoPage.ELIMINAR_CELULAR_CARRITO;
import static com.alkomprar.userinterfaces.ConfirmacionCarritoPage.CERRAR_MODAL;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.AGREGAR_ELEMENTO_CARRITO;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.DIV_PRIMER_ELEMENTO;
import static com.alkomprar.userinterfaces.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EliminarCarrito implements Task {
    private String articulo;

    public EliminarCarrito(String articulo) {
        this.articulo = articulo;
    }

    public static Performable elemento(String articulo) {

        return instrumented(EliminarCarrito.class, articulo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                MoveMouse.to(CATEGORIA.of(articulo)),
                WaitUntil.the(PRIMER_SUB_CATEGORIA.of(articulo), isVisible()),
                Click.on(PRIMER_SUB_CATEGORIA.of(articulo)),
                Scroll.to(DIV_PRIMER_ELEMENTO).andAlignToTop(),
                WaitUntil.the(AGREGAR_ELEMENTO_CARRITO, isClickable()),
                Click.on(AGREGAR_ELEMENTO_CARRITO),
                WaitUntil.the(CERRAR_MODAL, isClickable()),
                Click.on(CERRAR_MODAL),
                Click.on(CARRITO),
                Click.on(ELIMINAR_CELULAR_CARRITO)

        );
    }
}
