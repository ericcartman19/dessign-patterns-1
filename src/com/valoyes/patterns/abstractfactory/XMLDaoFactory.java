package com.valoyes.patterns.abstractfactory;

public class XMLDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(FactoryTypeEnum type) {
		
		Dao dao = null;
		
		if(FactoryTypeEnum.EMPLOYEE == type) {
			dao = new XMLEmpDao();
		}else {
			dao = new XMLDeptDao();
		}
		
		dao.save();
		return dao;
	}

}
