package com.valoyes.patterns.flyweight;

public class Circle extends Shape {

	private String label;
	// hemos eliminado los campos extrinsecos
	
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
