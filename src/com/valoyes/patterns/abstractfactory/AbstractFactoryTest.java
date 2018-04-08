package com.valoyes.patterns.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {

		DaoAbstractFactory daoAbstractFactory = DaoFactoryProducer.produce(FactoryTypeEnum.XML);
		Dao dao = daoAbstractFactory.createDao(DaoTypeEnum.EMPLOYEE);
		dao.save();
		
		
	}

}
