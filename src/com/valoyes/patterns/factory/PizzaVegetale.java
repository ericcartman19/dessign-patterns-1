package com.valoyes.patterns.factory;

public class PizzaVegetale implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing vegeterian pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking vegeterian pizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting vegeterian pizza");
	}
}
