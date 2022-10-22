package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarArticuloPage {

	/////////////////
	//PRIMER EVENTO
	public static final Target SUBCATEGORIA_HOGAR = Target.the("Sub-categoria muebles").locatedBy("//a[@data-subcategory='Muebles']");
	public static final Target ORDENAR_POR = Target.the("Ordena por").locatedByFirstMatching("//div[@class='float-select js-float-select js-float-group active-click']");
	public static final Target MENOR_A_MAYOR = Target.the("Menor a mayor").locatedBy("//li[@data-value='price-asc']");

	public static final Target AGREGAR_MUEBLE_CARRITO = Target.the("Buscador").locatedByFirstMatching("//button[@id='js-add-cart-7705152056075']");
	public static final Target IR_AL_CARRITO_MUEBLE = Target.the("Ir al carrito").locatedByFirstMatching("//a[@class='button-primary js-animateBeforeSend js-delayLocation']");

	/////////////////
	//SEGUNDO EVENTO
	public static final Target SUBCATEGORIA_TV = Target.the("Sub-categoria tv").locatedBy("//a[@title='TV']");
	public static final Target GRILLA_TELEVISORES = Target.the("Grilla Televisores").locatedBy("//i[@class='alk-icon-grid']");
	public static final Target RESULTADOS_PAGINA = Target.the("Resultados pagina").locatedBy("//div[@class='float-select js-float-select js-float-group full-width active-click']");
	public static final Target RESULTADOS_PAGINA_50 = Target.the("Resultados pagina 50").locatedBy("//li[@data-value='50']");

	/////////////////
	//TERCER EVENTO
	public static final Target SUBCATEGORIA_CELULAR = Target.the("Sub-categoria celular").locatedByFirstMatching("//a[@title='Celulares']");
	public static final Target AGREGAR_CELULAR = Target.the("Agregar celular").locatedByFirstMatching("//h2[@class='product__information--name']");
	public static final Target AGREGAR_CELULAR_CARRITO = Target.the("Agregar celular al carrito").locatedByFirstMatching("//button[contains(text(), 'Agregar al carrito')]");
	public static final Target IR_AL_CARRITO_CELULAR = Target.the("Ir al carrito").locatedByFirstMatching("//a[@class='button-primary js-animateBeforeSend js-delayLocation']");
	public static final Target ELIMINAR_CELULAR_CARRITO = Target.the("Eliminar celular del carrito").locatedBy("//a/i[@class='alk-icon-eliminar']");
}
