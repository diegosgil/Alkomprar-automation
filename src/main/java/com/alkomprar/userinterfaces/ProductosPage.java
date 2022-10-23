package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosPage {
    public static final Target LISTA_PRODUCTOS = Target.the("Lista productos").locatedBy("//li[@class='product__list--item product__list--alkosto']");
    public static final Target IMAGENES_PRODUCTOS = Target.the("Lista productos").locatedBy("//a[@class='js-product-click-datalayer']");
    public static final Target BOTON_VER_DETALLES = Target.the("Lista productos").locatedBy("//a[@id='js-view-details-8806094043297']");


}
