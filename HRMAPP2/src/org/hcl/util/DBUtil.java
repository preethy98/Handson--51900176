package org.hcl.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.hcl.model.Credentials;

public class DBUtil {
	public static Connection getConnection(String driver,String url,String username,String password)
	{
		Connection con=null;
		try {
		Class.forName(driver);
		con=DriverManager.getConnection(url,username,password);
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
	public static Credentials getCredentials()
	{
	Credentials credentials=null;
		Properties properties=null;
		try{
			properties=new Properties();
			credentials=new Credentials();
			properties.load(new FileInputStream("C:\\Users\\PREETHY\\eclipse-workspace\\HRMAPP\\src\\org\\hcl\\util\\database.properties"));
			credentials.setDriver(properties.getProperty("driver"));
			credentials.setUrl(properties.getProperty("url"));
			credentials.setUname(properties.getProperty("uname"));
			credentials.setPassword(properties.getProperty("password"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return credentials;
		
	}

}
