package com.valoyes.patterns.flyweight;

public abstract class Shape {
	
	/**
	 * Dummy method, que realizara ningun trabajo y que relmente sera implementado 
	 * en la clase Circle
	 */
	public void draw(int radius, String fillColor, String lineColor) {
		// no - op
	}
	
	/**
	 * Dummy method, que realizara ningun trabajo y que relmente sera implementado 
	 * en la clase Rectangle
	 */
	public void draw(int length, int breadth, String fillStyle) {
		// no - op
	}
	
	
}
