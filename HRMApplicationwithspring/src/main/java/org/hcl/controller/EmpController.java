package org.hcl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hcl.entities.Emp;
import org.hcl.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpController {
	private EmpService service;

	public EmpController() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public EmpController(EmpService service) {
		super();
		this.service = service;
	}

	@RequestMapping("/")
	public String showhome()
	{
		return "home";
	}
	@RequestMapping("/new")
public String showform()
{
	return "emp-form";
}@RequestMapping(value="/process",method=RequestMethod.POST)
	public String processform(HttpServletRequest request,HttpServletResponse response,Model model) {
	int eno=Integer.parseInt(request.getParameter("eno"));
	String name=request.getParameter("name");
	String address=request.getParameter("address");
	Emp e=new Emp(eno,name,address);
		boolean b= service.insertEmployees(e);
		//String url=null;
		String msg=null;
		if(b)
		{
			msg="Inserted Successfully";
			model.addAttribute("msg",msg);
			//url="redirect:/";
		}
		return "home";
	}
}
