package com.valoyes.patterns.factory;

public class PizzaFactoryTest {
	
	public static void main(String[] args) {
		PizzaStore store = new PizzaStore();
		store.orderPizza(PizzaTypeEnum.FRITTA);
	}
	
}
