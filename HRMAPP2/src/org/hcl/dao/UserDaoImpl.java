package org.hcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;

import org.hcl.model.Credentials;
import org.hcl.model.User;
import org.hcl.util.DBUtil;

public class UserDaoImpl implements UserDao{
Credentials credentials=DBUtil.getCredentials();
	@Override
	public boolean insert(User user) {
		boolean b=false;
		Connection con=null;
		PreparedStatement pst=null;
		int i;
		try {
			con=DBUtil.getConnection(credentials.getDriver(),credentials.getUrl(),credentials.getUname(),credentials.getPassword());
			if(con!=null)
			{
				pst=con.prepareStatement("insert into user(id,username,password,gender,designation) values(?,?,?,?,?)");
			pst.setInt(1, user.getUserid());
			pst.setString(2, user.getUsername());
			pst.setString(3, user.getPassword());
			pst.setString(4, user.getGender());
			pst.setString(5, user.getDesignation());
			i=pst.executeUpdate();
			if(i>0)
				b=true;
			}
			con.close();
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return b;
		}
	@Override
	public boolean validate(User user) {
		boolean b=false;
		Connection con=null;
		PreparedStatement pst=null;
ResultSet rs=null;
		int i;
		try {
			con=DBUtil.getConnection(credentials.getDriver(),credentials.getUrl(),credentials.getUname(),credentials.getPassword());
			if(con!=null)
			{
pst=con.prepareStatement("select * from user where username=?and password=?");
pst.setString(1,user.getUsername());
pst.setString(2, user.getPassword());
rs=pst.executeQuery();
b=rs.next();
			}
			con.close();
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return b;
}
	@Override
	public Optional<User> getUserByUsername(String username) {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		Optional<User> userOptional=null;
		boolean b=false;
		try {
			con=DBUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(),credentials.getPassword());
			if(con!=null)
			{
				pst=con.prepareStatement("select * from user where username=?");
				pst.setString(1, username);
				rs=pst.executeQuery();
				rs.next();
				User user=new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				userOptional=Optional.ofNullable(user);
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return userOptional;
	}
}
