package org.hcl.service;

import java.util.List;

import org.hcl.dao.EmpDao;
import org.hcl.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmpServiceImpl implements EmpService{
EmpDao dao;
public EmpServiceImpl() {
	// TODO Auto-generated constructor stub
}
@Autowired
	public EmpServiceImpl(EmpDao dao) {
	super();
	this.dao = dao;
}

	public EmpDao getDao() {
		return dao;
	}

	public void setDao(EmpDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Emp> getEmployees() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}
