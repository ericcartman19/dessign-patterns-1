package com.valoyes.patterns.sinlgeton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SingletonTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
//		DateUtil dateUtil1 = DateUtil.getInstance();
//		DateUtil dateUtil2 = /*DateUtil.getInstance();*/ null;
//		
//		// abordando el problema de Singleton serialization
//		// al ejecutar este codigo no tendremos el mismo objeto al deserializar
//		// System.out.println(dateUtil1 == dateUtil2); ==> false
//		
//		// 1. serializamos
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/home/benito/Documents/singletonfolder/singleton.txt")));
//		oos.writeObject(dateUtil1);
//		
//		//2. deserializamos
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/home/benito/Documents/singletonfolder/singleton.txt")));
//		dateUtil2 = (DateUtil) ois.readObject();
//		System.out.println(dateUtil1 == dateUtil2);
//		
//		// 3. el problema se corrige con readResolve, ya que una vez que se ha terminado de leer desde el fichero
//		// se llama al metodo el cual devuelve la unica instancia existente, de esta manera se impide la creacion
//		// de mas de una instancia a traves de serialization deserialization
//		
//		oos.close();
//		ois.close();
		
		Logger log1 = Logger.getInstance();
		Logger log2 = null;
		
		// 1. serializamos
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/home/benito/Documents/singletonfolder/singletonLogger.txt")));
		oos.writeObject(log1);
		
		//2. deserializamos
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/home/benito/Documents/singletonfolder/singletonLogger.txt")));
		log2 = (Logger) ois.readObject();
		System.out.println(log1 == log2);
		
		// 3. el problema se corrige con readResolve, ya que una vez que se ha terminado de leer desde el fichero
		// se llama al metodo el cual devuelve la unica instancia existente, de esta manera se impide la creacion
		// de mas de una instancia a traves de serialization deserialization
		
		oos.close();
		ois.close();
		
	}
	
}
