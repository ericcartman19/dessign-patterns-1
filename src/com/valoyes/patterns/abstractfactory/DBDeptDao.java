package com.valoyes.patterns.abstractfactory;

public class DBDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Employee to XML");
	}

	
}
