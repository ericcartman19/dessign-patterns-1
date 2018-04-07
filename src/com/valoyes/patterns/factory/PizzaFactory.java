package com.valoyes.patterns.factory;

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
