package com.valoyes.patterns.factory;

/**
 * @author benito
 * 
 * Pizza interface, who's implementation will be 
 * implemention with be created by the PizzaFactory
 *
 */
public interface Pizza {

	void prepare();
	
	void bake();
	
	void cut();
}
