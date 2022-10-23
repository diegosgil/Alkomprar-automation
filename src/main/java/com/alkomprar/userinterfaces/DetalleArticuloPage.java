package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetalleArticuloPage {
	public static final Target DIV_PRIMER_ELEMENTO = Target.the("Primer elemento").locatedByFirstMatching("//h2[@class='product__information--name']");
	public static final Target AGREGAR_ELEMENTO_CARRITO = Target.the("Agregar elemento al carrito").locatedByFirstMatching("//button[contains(text(), 'Agregar al carrito')]");


	public static final Target AGREGAR_REPISA_CARRITO = Target.the("Buscador").locatedBy("//button[@id='js-add-cart-7707036542728']");
	public static final Target ORDENAR_POR = Target.the("Ordena por").locatedByFirstMatching("//div[@class='sort-refine-bar__orderBy__sortby form-group']");
	public static final Target MENOR_A_MAYOR = Target.the("Menor a mayor").locatedBy("//li[@data-value='price-asc']");


	public static final Target RESULTADOS_PAGINA = Target.the("Resultados pagina").locatedBy("//div[@class='float-select js-float-select js-float-group full-width active-click']");
	public static final Target RESULTADOS_PAGINA_50 = Target.the("Resultados pagina 50").locatedBy("//li[@data-value='50']");


	public static final Target DETALLE_ARTICULO = Target.the("Resultados pagina").locatedBy("//div[@class='product__details-section__header']");

}
