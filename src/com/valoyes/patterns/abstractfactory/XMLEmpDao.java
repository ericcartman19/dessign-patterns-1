package com.valoyes.patterns.abstractfactory;

public class XMLEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Department to XML");
	}

	
}
