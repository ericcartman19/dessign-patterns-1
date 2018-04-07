package com.valoyes.patterns.factory;

public class PizzaStore {

	public Pizza orderPizza(PizzaTypeEnum type) {
		return PizzaFactory.create(type);
	}
	
}
