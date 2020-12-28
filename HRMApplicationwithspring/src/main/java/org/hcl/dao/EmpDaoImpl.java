package org.hcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.hcl.entities.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class EmpDaoImpl implements EmpDao{
	private DataSource datasource;
	
	public EmpDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public EmpDaoImpl(DataSource datasource) {
		super();
		this.datasource = datasource;
	}

	@Override
	public boolean insert(Emp e) {
Connection con=null;
		PreparedStatement pst=null;
		boolean b=false;
		try {
		con=datasource.getConnection();
		if(con!=null)
		{
			int i=0;
			pst=con.prepareStatement("insert into emp(eno,name,address) values(?,?,?)");
		pst.setInt(1, e.getEno());
		pst.setString(2, e.getName());
		pst.setString(3, e.getAddress());
		i=pst.executeUpdate();
		if(i>0)
		{
			b=true;
		}
		}
		con.close();
		}catch(Exception s)
		{
			s.printStackTrace();
		}
		return b;
	}

}
