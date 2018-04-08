package com.valoyes.patterns.templatemethod;

/**
 * Esta es la clase abstracta que enforces el "Template Method Pattern"
 * 
 * @author benito
 *
 */
public abstract class DataRenderer {

	// este es el template mathod
	public void render() {
		
		String data = readData();
		String processedData = processData(data);
		System.out.println("processedData = " + processedData);
	}
	
	public abstract String readData();
	
	public abstract String processData(String data);
}
