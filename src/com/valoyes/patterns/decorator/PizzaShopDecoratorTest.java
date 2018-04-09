package com.valoyes.patterns.decorator;

public class PizzaShopDecoratorTest {

	public static void main(String[] args) {
		// 1. plain pizza
//		Pizza pizza = new PlainPizza();
//		pizza.bake();
		
		// 2. applying one decorator
//		Pizza pizza = new CheesePizzaDecorator(new PlainPizza());
//		pizza.bake();
		
		//3. applying two decorators
		Pizza pizza = new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
		pizza.bake();
	}
}
