package com.alkomprar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.alkomprar.userinterfaces.ConfirmacionCarritoPage.CERRAR_MODAL;
import static com.alkomprar.userinterfaces.ConfirmacionCarritoPage.IR_AL_REPISA_MUEBLE;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.*;
import static com.alkomprar.userinterfaces.MenuPage.CATEGORIA;
import static com.alkomprar.userinterfaces.SeleccionarArticuloPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ComprarRepisa implements Task {
    private String articulo, categoria;

    public ComprarRepisa(String articulo, String categoria) {
        this.articulo = articulo;
        this.categoria = categoria;
    }

    public static Performable elemento(String articulo, String categoria) {
        return instrumented(ComprarRepisa.class, articulo, categoria);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                MoveMouse.to(CATEGORIA.of(categoria)),
                WaitUntil.the(SUBCATEGORIA_HOGAR_REPISA, isVisible()),
                Click.on(SUBCATEGORIA_HOGAR_REPISA),
                WaitUntil.the(ORDENAR_POR, isClickable()),
                Click.on(ORDENAR_POR),
                Click.on(MENOR_A_MAYOR),
                Scroll.to(ORDENAR_POR).andAlignToTop(),
                Click.on(AGREGAR_ELEMENTO_CARRITO),
                Click.on(CERRAR_MODAL)
        );
    }
}














