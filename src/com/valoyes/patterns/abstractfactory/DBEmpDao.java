package com.valoyes.patterns.abstractfactory;

public class DBEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Department to DB");
	}

	
}
