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

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public String getFillStyle() {
		return fillStyle;
	}

	public void setFillStyle(String fillStyle) {
		this.fillStyle = fillStyle;
	}
	
}
