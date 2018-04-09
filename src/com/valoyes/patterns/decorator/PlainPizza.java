package com.valoyes.patterns.decorator;

/**
 * 
 * En el "Decorator" pattern esta clase es el "Concrete-Component"
 * o un starting point para el producto final que queremos lograr
 * 
 */
public class PlainPizza implements Pizza{

	@Override
	public void bake() {
		System.out.println("Baking plain pizza");
	}

}
