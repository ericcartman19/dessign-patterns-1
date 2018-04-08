package com.valoyes.patterns.abstractfactory;

/**
 * Esta class es una "Factory of Factories"
 * o implementtacion de "Abstract Factory Pattern"
 * @author benito
 *
 */
public class DaoFactoryProducer {
	
	public static DaoAbstractFactory produce(FactoryTypeEnum type) {
		DaoAbstractFactory daoAbstractFactory = null;
		
		if(FactoryTypeEnum.XML == type) {
			daoAbstractFactory = new XMLDaoFactory();
		}else if (FactoryTypeEnum.DB == type) {
			daoAbstractFactory = new DBDaoFactory();
		}
		
		return daoAbstractFactory;
	}

}
