package com.valoyes.patterns.abstractfactory;

public abstract class DaoAbstractFactory {
	
	public abstract Dao createDao(DaoTypeEnum type);
	
}
