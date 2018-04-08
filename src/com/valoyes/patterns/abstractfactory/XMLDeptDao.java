package com.valoyes.patterns.abstractfactory;

public class XMLDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Employee to XML");
	}

	
}
