package com.valoyes.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Esta clase crea los Shape objects a partir del tipo, 
 * sin embargo su gran ventaja es que realizara "caching"
 * de los objetos creados a traves de un hashmap, lo cual 
 * permitira la reutilizacion
 * 
 * @author benito
 *
 */
public class ShapeFactory {

	// crearemos el shape una sola vez y haremos cache
	// en este map
	private static Map<ShapeTypeEnum, Shape> shapes = new HashMap<>();
	
	public static Shape getShape(ShapeTypeEnum type) {
		
		Shape shape = null;
		
		// si existe en el mapa la reutilizamos
		if(shapes.get(type) != null) {
			shape = shapes.get(type);
			
			// sino...
		}else {
			
			if(ShapeTypeEnum.CIRCLE == type) {
				shape = new Circle();
			}else {
				shape = new Rectangle();
			}
			
			// agregamos el nuevo shape al map
			shapes.put(type, shape);
		}
		
		return shape;	
	}
}
