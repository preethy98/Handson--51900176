package org.hcl.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hcl.model.Credentials;
import org.hcl.model.Emp;
import org.hcl.util.DBUtil;

public class EmpDaoImpl implements EmpDao{

	@Override
	public List<Emp> getEmp() {
		List<Emp> emp=new ArrayList<>();
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	Credentials credentials=DBUtil.getCredentials();
	try {
		con=DBUtil.getConnection(credentials.getDriver(),credentials.getUrl(),credentials.getUname(),credentials.getPassword());
		if(con!=null) {
		st=con.createStatement();
		rs=st.executeQuery("select * from emp");
		while(rs.next())
		{
		emp.add(new Emp(rs.getInt(1),rs.getString(2),rs.getString(3)));
		}
	}
	}
		catch(Exception e)
	{
		e.printStackTrace();
	}
		return  emp;
	}

}
