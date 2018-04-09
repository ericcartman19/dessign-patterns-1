package com.valoyes.patterns.decorator;

/**
 * Concrete Decorator
 *
 */
public class CheesePizzaDecorator extends PizzaDecorator {

	public CheesePizzaDecorator(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public void bake() {
		super.bake();
		System.out.println("Adding cheese toppings");
	} 

}
