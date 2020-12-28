package org.hcl.dao;

import java.util.List;

import org.hcl.model.Emp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmpDao e=new EmpDaoImpl();
List<Emp> x=null;
x=e.getEmp();
for(Emp y:x)
{
System.out.println(y.getEno()+y.getName()+y.getAddress());	
}
	}

}
