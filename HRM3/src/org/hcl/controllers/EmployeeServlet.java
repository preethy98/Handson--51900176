package org.hcl.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hcl.model.Emp;
import org.hcl.service.EmpService;
import org.hcl.service.EmpServiceImpl;

public class EmployeeServlet extends HttpServlet{
private static final long serialVersionUID = 1L;
EmpService service=new EmpServiceImpl();
@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	List<Emp> employees=service.getEmp();
	request.setAttribute("empdet",employees);
	RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
	rd.forward(request,response);
	}
}

