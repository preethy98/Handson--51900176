package org.hcl.service;

import org.hcl.dao.EmpDao;
import org.hcl.entities.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmpServiceImpl implements EmpService{
private EmpDao dao;

public EmpServiceImpl() {
	// TODO Auto-generated constructor stub
}
@Autowired
	public EmpServiceImpl(EmpDao dao) {
	super();
	this.dao = dao;
}

	@Override
	public boolean insertEmployees(Emp e) {
		// TODO Auto-generated method stub
		return dao.insert(e) ;
	}

	
	
}
