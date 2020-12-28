package org.hcl.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hcl.model.Credentials;
import org.hcl.model.Product;
import org.hcl.util.DBUtil;

public class ProductDaoImpl implements ProductDao{
Credentials credentials=DBUtil.getCredentials();
	@Override
	public List<Product> getAll() {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		List<Product> products=new ArrayList<>();
		int i;
		try {
			con=DBUtil.getConnection(credentials.getDriver(),credentials.getUrl(),credentials.getUname(),credentials.getPassword());
			if(con!=null)
			{
				st=con.createStatement();
				rs=st.executeQuery("select * from products");
				while(rs.next())
				{
					products.add(new Product(rs.getInt(1) ,rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5)));
					
				}
				
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return products ;
	}

}
