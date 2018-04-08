package com.valoyes.patterns.abstractfactory;

/**
 * Esta clase es la implementacion de Factory pattern
 * 
 * @author benito
 *
 */
public class XMLDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(DaoTypeEnum type) {
		
		Dao dao = null;
		
		if(DaoTypeEnum.EMPLOYEE == type) {
			dao = new XMLEmpDao();
		}else {
			dao = new XMLDeptDao();
		}
		
		dao.save();
		return dao;
	}

}
