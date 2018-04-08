package com.valoyes.patterns.flyweight;

public class PaintApp {

	public void render(int numberOfShappes) {

		Shape[] shapes = new Shape[numberOfShappes + 1];

		// este codigo guarro ya no sera necesario
//		for (int i = 1; i < numberOfShappes; i++) {
//			if (i % 2 == 0) {
//
//				shapes[i] = new Circle();
//
//				((Circle) shapes[i]).setRadius(i);
//				((Circle) shapes[i]).setLineColor("red");
//				((Circle) shapes[i]).setFillColor("white");
//				shapes[i].draw();
//				
//			} else {
//
//				shapes[i] = new Rectangle();
//
//				((Rectangle) shapes[i]).setLength(i);
//				((Rectangle) shapes[i]).setBreadth(i+i);
//				((Rectangle) shapes[i]).setFillStyle("dotted");
//				shapes[i].draw();
//			}
//		}
		
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
