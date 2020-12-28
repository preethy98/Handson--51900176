package org.hcl.test;

import org.hcl.entities.Emp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory  factory=config.buildSessionFactory();
		Session session=factory.openSession();
Emp e=new Emp(10,"bhavani","Andhra");
Transaction tx=session.beginTransaction();
Integer i=(Integer)session.save(e);
tx.commit();
System.out.println("The Employees with number"+i+"inserted succesfully");
	}

}
