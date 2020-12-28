package com.hcl.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.hcl.model.Emp;

public class EmpDaoImpl implements EmpDao {
private DataSource dsrc;
public EmpDaoImpl() {
	// TODO Auto-generated constructor stub
}

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
		List<Emp> list=new ArrayList<>();
		Connection con =null;
		Statement st=null;
		ResultSet rs=null;
		try {
			con=dsrc.getConnection();
			st=con.createStatement();
			rs=st.executeQuery("select * from emp");
			while(rs.next())
			{

				list.add(new Emp(rs.getInt(1),rs.getString(2),rs.getString(3)));
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
}
