package com.valoyes.patterns.decorator;

/**
 * Concrete Decorator
 *
 */
public class VeggiePizzaDecorator extends PizzaDecorator {

	public VeggiePizzaDecorator(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public void bake() {
		super.bake();
		System.out.println("Adding veggie toppings");
	} 

}
