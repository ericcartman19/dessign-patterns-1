package com.valoyes.patterns.factory;

public class PizzaFritta implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing pizza fritta");
	}

	@Override
	public void bake() {
		System.out.println("Baking pizza fritta");
	}

	@Override
	public void cut() {
		System.out.println("Cutting pizza fritta");
	}
	
}
