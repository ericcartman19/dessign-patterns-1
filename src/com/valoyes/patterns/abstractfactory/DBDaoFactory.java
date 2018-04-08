package com.valoyes.patterns.abstractfactory;

public class DBDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(FactoryTypeEnum type) {
		
		Dao dao = null;
		
		if(FactoryTypeEnum.EMPLOYEE == type) {
			dao = new DBEmpDao();
		}else {
			dao = new DBDeptDao();
		}
		
		dao.save();
		return dao;
	}

}
