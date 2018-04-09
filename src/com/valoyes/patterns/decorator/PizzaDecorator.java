package com.valoyes.patterns.decorator;

/**
 * Base Decorator class
 * Que implementa Pizza e invoca el metodo bake() de cualquiera
 * Pizza se le haya pasado
 *
 */
public class PizzaDecorator implements Pizza {

	private Pizza pizza;
	
	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public void bake() {
		pizza.bake();
	}

}
