package org.hcl.controllers;



import java.util.List;

import org.hcl.model.Emp;
import org.hcl.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
private	EmpService service;
public HelloController() {
	// TODO Auto-generated constructor stub
}
@Autowired
public HelloController(EmpService service) {
	super();
	this.service = service;
}

public EmpService getService() {
	return service;
}

public void setService(EmpService service) {
	this.service = service;
}

@RequestMapping(value="/",method=RequestMethod.GET)
	public String showname() {
		return "home";
	}
@RequestMapping(value="/display",method=RequestMethod.GET)
public String display(Model model) {
	List<Emp> emps=service.getEmployees();
	model.addAttribute("employee", emps);
	return "home";
	
}
}
