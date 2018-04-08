package com.valoyes.patterns.flyweight;

public class Rectangle extends Shape {
	
	private String label;
	// hemos eliminado los campos extrinsecos
	
	public Rectangle() {
		label = "Rectangle";
	}
	
	@Override
	public void draw(int length, int breadth, String fillStyle) {
		
		String description = "Drawing: [label=" + label + ", length=" + length + ", breadth=" + breadth + ", fillStyle=" + fillStyle
				+ "]";
		System.out.println(description);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
}
