package com.valoyes.patterns.sinlgeton;

/**
 * @author benito
 * 
 * Clase singleton siguiendo 3 pasos basicos
 * 
 * 1/ crear un constructor private para impedir la instanciacion directa
 * 2/ creacion de un metodo publico estatico que devuelvev una instancia de la propia clases
 * 3/ creacion de un campo estatico private del tipo de la clase que es el que se 
 *
 */
public class DateUtil {

	private static DateUtil instance;
	
	private DateUtil() {
		// ctor privado de esta manera, ninguna otra clase podra instanciar directamente esta clase
	}
	
	// metodo estatico cuyo nombre es una convetion utilizado para
	// solo crearemos una nueva instancia si el miembro privado es nulo,
	// es decir la primera vez
	public static DateUtil getInstance() {
		if(instance == null) {
			instance = new DateUtil();
		}
		return instance;
	}
}
