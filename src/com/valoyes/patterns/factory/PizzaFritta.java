package com.valoyes.patterns.factory;

public class PizzaFritta implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing pepperoni pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking pepperoni pizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting pepperoni pizza");
	}
	
}
