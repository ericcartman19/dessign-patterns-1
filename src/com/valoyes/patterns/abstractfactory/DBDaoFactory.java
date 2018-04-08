package com.valoyes.patterns.abstractfactory;

/**
 * Esta clase es la implementacion de Factory pattern
 * 
 * @author benito
 *
 */
public class DBDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(DaoTypeEnum type) {
		
		Dao dao = null;
		
		if(DaoTypeEnum.EMPLOYEE == type) {
			dao = new DBEmpDao();
		}else {
			dao = new DBDeptDao();
		}
		
		return dao;
	}

}
