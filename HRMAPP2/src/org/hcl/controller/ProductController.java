package org.hcl.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hcl.model.Product;
import org.hcl.service.ProductService;
import org.hcl.service.ProductServiceImpl;

@WebServlet("/product")
public class ProductController extends HttpServlet {
	ProductService prodservice=new ProductServiceImpl();
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		List<Product> products=prodservice.getProducts();
		HttpSession session=request.getSession();
		session.setAttribute("productdetails", products);
		RequestDispatcher rd=request.getRequestDispatcher("product.jsp");
		rd.forward(request, response);
	}
}
