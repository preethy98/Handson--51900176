package org.hcl.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hcl.model.User;
import org.hcl.service.UserService;
import org.hcl.service.UserServiceImpl;

@WebServlet("/signup")
public class SignupController extends HttpServlet {
	UserService service=new UserServiceImpl();
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

String msg="";
int id=Integer.parseInt(request.getParameter("uid"));
String username=request.getParameter("username");
String password=request.getParameter("password");
String gender=request.getParameter("gender");
String designation=request.getParameter("designation");
User user=new User(id,username,password,gender,designation);
boolean b=service.register(user);
if(b)
	msg="Succesfully inserted";
else 
	msg="Sorry Not Registered try again after sometime";

	request.setAttribute("message",msg);
	RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
	rd.forward(request, response);
}
}