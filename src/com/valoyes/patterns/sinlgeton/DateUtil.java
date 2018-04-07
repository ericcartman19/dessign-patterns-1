package com.valoyes.patterns.sinlgeton;

import java.io.Serializable;

/**
 * @author benito
 * 
 *         Clase singleton siguiendo 3 pasos basicos
 * 
 *         1/ crear un constructor private para impedir la instanciacion directa
 *         2/ creacion de un metodo publico estatico que devuelvev una instancia
 *         de la propia clases 3/ creacion de un campo estatico private del tipo
 *         de la clase que es el que se
 *
 */
public class DateUtil implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private static volatile DateUtil instance;

	private DateUtil() {
		// ctor privado de esta manera, ninguna otra clase podra instanciar directamente
		// esta clase
	}

	// syncronized : fuerza a que el metodo solo pueda ser accedido
	// por un thread a la vez -> lo cual lo har'a thread-safe
	public static synchronized DateUtil getInstance() {

		// syncrhonized is a very expensive operation, y queremos hacerlo 
		// solo cuando sea necesario
		if (instance == null) {
			// tenemos que adquerir un lock del objeto o de la clase
			synchronized (DateUtil.class) {
				// lazy initialization
				if (instance == null) {
					instance = new DateUtil();
				}
			}
		}

		return instance;
	}
}
