package org.hcl.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
SessionFactory sessionfactory=con.buildSessionFactory();
Session session=sessionfactory.openSession();
/*Customer c=new Customer(1,"Aarthy","America"); "inserting 1 object"
Transaction tx=session.beginTransaction();
session.save(c);
tx.commit();*/

/*Customer c=session.get(Customer.class, 1);
System.out.println(c.getEno()+"\t"+c.getName()+"\t"+c.getAddress());   "Retrieving 1 object using get method" */



/*Customer c=session.load(Customer.class, 1);
System.out.println(c.getEno()+"\t"+c.getName()+"\t"+c.getAddress()); "Retrieving 1 object using load method"*/

/*Transaction tx=session.beginTransaction();
Customer c=session.get(Customer.class,1);
c.setAddress("Australia");
c.setName("Anu");
session.update(c);   "Updating object"
tx.commit();
System.out.println(c.getEno()+"\t"+c.getName()+"\t"+c.getAddress());*/


/*Customer c=new Customer(2,"Aarthy","America"); //"inserting 1 object"
Transaction tx=session.beginTransaction();
session.save(c);
tx.commit();*/

Transaction tx=session.beginTransaction();
Customer c=session.get(Customer.class, 5);
Customer d=session.get(Customer.class, 3);
System.out.println(d.getEno()+"\t"+d.getName()+"\t"+d.getAddress());
Customer d1=session.get(Customer.class, 3);
System.out.println(d1.getEno()+"\t"+d1.getName()+"\t"+d1.getAddress());
session.delete(c);
session.evict(d1);
//session.clear();
Customer d11=session.get(Customer.class, 3);
System.out.println(d11.getEno()+"\t"+d11.getName()+"\t"+d11.getAddress());
tx.commit();

session.close();
	}

}
