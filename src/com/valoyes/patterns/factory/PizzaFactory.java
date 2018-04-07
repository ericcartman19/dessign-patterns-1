package com.valoyes.patterns.factory;

/**
 * @author benito
 * 
 * Factory class que se toma la responsabilidad de la instanciacion, de modo que la(s)
 * clase(s) cliente(s) se pueda concentrar solo en la logica
 *
 */
public class PizzaFactory {

	public static Pizza create(PizzaTypeEnum type) {

		Pizza pizza = null;

		if (PizzaTypeEnum.MARGHERITA == type) {
			pizza = new PizzaMargherita();

		} else if (PizzaTypeEnum.FRITTA == type) {
			pizza = new PizzaFritta();

		} else {
			pizza = new PizzaVegetale();
		}

		pizza.prepare();
		pizza.bake();
		pizza.cut();

		return pizza;

	}

}
