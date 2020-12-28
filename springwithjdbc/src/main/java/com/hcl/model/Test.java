package com.hcl.model;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.service.EmpService;
import com.hcl.service.EmpServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean.xml");
EmpService service=context.getBean(EmpServiceImpl.class);
List<Emp> e=service.getEmployees();
e.stream().forEach(emp->
{System.out.println(emp.getEno()+"\t"+emp.getName()+"\t"+emp.getAddress());});
	}
}
