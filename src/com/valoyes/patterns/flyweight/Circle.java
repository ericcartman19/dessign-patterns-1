package com.valoyes.patterns.flyweight;

public class Circle extends Shape {

	private String label;
	// estos tres campos son extrinsecos
	// no tienen nada en com'un con rectangulo
	// y los pasaremos como parametros a draw method
	// private int radius;
	// private String fillColor;
	// private String lineColor;
	
	public Circle() {
		label = "Circle";
	}
	
	@Override
	public void draw(int radius, String fillColor, String lineColor) {

		String description = "Drawing:  [label=" + label + ", radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor
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
