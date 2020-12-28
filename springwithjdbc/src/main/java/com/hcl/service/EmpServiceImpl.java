package com.hcl.service;

import java.util.List;

import com.hcl.dao.EmpDao;
import com.hcl.dao.EmpDaoImpl;
import com.hcl.model.Emp;

public class EmpServiceImpl implements EmpService{
EmpDao empdao;
public EmpServiceImpl() {
	// TODO Auto-generated constructor stub
}

	public EmpServiceImpl(EmpDao empdao) {
	super();
	this.empdao = empdao;
}

	public EmpDao getEmpdao() {
	return empdao;
}

public void setEmpdao(EmpDao empdao) {
	this.empdao = empdao;
}

	@Override
	public List<Emp> getEmployees() {
		return empdao.getAll();
	}

}
