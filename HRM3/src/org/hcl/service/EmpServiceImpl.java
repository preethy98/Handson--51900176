package org.hcl.service;

import java.util.List;

import org.hcl.dao.EmpDao;
import org.hcl.dao.EmpDaoImpl;
import org.hcl.model.Emp;

public class EmpServiceImpl implements EmpService{
EmpDao dao=new EmpDaoImpl();
	@Override
	public List<Emp> getEmp() {
	
		return dao.getEmp();
	}
	

}
