package org.hcl.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.hcl.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class EmpDaoImpl implements EmpDao{
private DataSource dsrc;
public EmpDaoImpl() {
	// TODO Auto-generated constructor stub
}
@Autowired
	public EmpDaoImpl(DataSource dsrc) {
	super();
	this.dsrc = dsrc;
}

	public DataSource getDsrc() {
		return dsrc;
	}

	public void setDsrc(DataSource dsrc) {
		this.dsrc = dsrc;
	}

	@Override
	public List<Emp> getAll() {
Connection con=null;
Statement st=null;
ResultSet rs=null;
List<Emp> emp=new ArrayList<>();
try {
	con=dsrc.getConnection();
	if(con!=null) {
	st=con.createStatement();
	rs=st.executeQuery("select * from emp");
	while(rs.next())
	{
		emp.add(new Emp(rs.getInt(1),rs.getString(2),rs.getString(3)));
	}
	}
	con.close();
}catch(Exception e)
{
	e.printStackTrace();
}
		return emp;
	}

}
