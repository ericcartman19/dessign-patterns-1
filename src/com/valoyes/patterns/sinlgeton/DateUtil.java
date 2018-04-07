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
public class DateUtil implements Serializable, Cloneable {
	
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
	
	// cuando se deserializa nuestro metodo se invocara el readResolve method
	// una vez que se ha terminado de leer desde el fichero
	// se llama al metodo el cual devuelve la unica instancia existente, de esta manera se impide la creacion
	// de mas de una instancia a traves de serialization deserialization
	/// hacemos el metodo private or protected para que otras clases no se puedan hacer con la instancia directamente
	// en este casco la dejamos protected para que las clases hijas si requerido puedad @override el metodo
	protected Object readResolve() {
		return instance;
	}
	
	// si una clase cliente trata clonar nuestra objeto de manera directa
	// o a traves de una child class de DateUtil el metodo devolvera
	// la cloneNotSupported exception
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
}
