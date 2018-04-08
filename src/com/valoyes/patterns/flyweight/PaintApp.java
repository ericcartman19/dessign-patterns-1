package com.valoyes.patterns.flyweight;

public class PaintApp {

	public void render(int numberOfShappes) {
		
		Shape shape = null;
		for(int i = 1; i <= numberOfShappes; i++) {
			if(i % 2 == 0) {
				shape = ShapeFactory.getShape(ShapTypeEnum.CIRCLE);
				shape.draw(i, "red", "white");
			}else {
				shape = ShapeFactory.getShape(ShapTypeEnum.RECTANGLE);
				shape.draw(i, i + i, "dotted");
			}
		}

	}
}
