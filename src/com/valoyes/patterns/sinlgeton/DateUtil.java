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

	// eager initialization cuando estamos seguros que nuestra clase sera utilizada el menos una vez
	// en nuestra application
	private static DateUtil instance;
	
	// static blocks en Java se cargan una sola vez: cuando la clase se carga en memoria
	// static blocks tambien son eager initialization
//	static {
//		instance = new DateUtil();
//	}
	
	private DateUtil() {
		// ctor privado de esta manera, ninguna otra clase podra instanciar directamente esta clase
	}
	
	// metodo estatico cuyo nombre es una convetion utilizado para
	// solo crearemos una nueva instancia si el miembro privado es nulo,
	// es decir la primera vez
	public static DateUtil getInstance() {
		// lazy initialization
		if(instance == null) {
			instance = new DateUtil();
		}
		return instance;
	}
}
