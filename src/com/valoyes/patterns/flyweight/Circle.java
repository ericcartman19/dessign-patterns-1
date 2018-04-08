package com.valoyes.patterns.flyweight;

public class Circle implements Shape {

	private String label;
	private int radius;
	private String fillColor;
	private String lineColor;
	
	public Circle() {
		label = "Circle";
	}
	
	@Override
	public void draw() {

		String description = "Circle [label=" + label + ", radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor
				+ "]";
		System.out.println(description);
	}	
}
