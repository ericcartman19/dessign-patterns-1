package com.valoyes.patterns.flyweight;

public class Rectangle implements Shape {
	
	private String label;
	private int length;
	private int breadth;
	private String fillStyle;
	
	public Rectangle() {
		label = "Rectangle";
	}
	
	@Override
	public void draw() {
		
		String description = "Rectangle [label=" + label + ", length=" + length + ", breadth=" + breadth + ", fillStyle=" + fillStyle
				+ "]";
		System.out.println(description);
	}

	
}
