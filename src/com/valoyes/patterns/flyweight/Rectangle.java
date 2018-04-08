package com.valoyes.patterns.flyweight;

public class Rectangle extends Shape {
	
	private String label;
	// estos tres campos son extrinsecos
	// no tienen nada en com'un con circulo
	// y los pasaremos como parametros a draw method
	// private int length;
	// private int breadth;
	// private String fillStyle;
	
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
