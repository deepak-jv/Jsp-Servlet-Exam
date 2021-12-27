package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.model.product_detail;
import com.java.product_detail.dao.productDao;
import com.java.product_detail.dao.productDaoImpl;

public class createProduct extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession hs = request.getSession(false);
		String name1 = (String) hs.getAttribute("name");
		String password = (String) hs.getAttribute("password");
		
		productDao p = new productDaoImpl();
		product_detail pd = new product_detail();
		
		String name = request.getParameter("name");
		int price = Integer.parseInt(request.getParameter("price"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		String vendor = request.getParameter("vendor");
		int waranty = Integer.parseInt(request.getParameter("waranty"));
		
		
		pd.setPname(name);
		pd.setPrice(price);
		pd.setQuantity(quantity);
		pd.setVendor(vendor);
		pd.setWarranty(waranty);
		
		try {
			
			if(hs!=null && name1!=null) {
			p.save(pd);
			out.println("<h4 style='color:green;text-align:center'>Data added successfully</h4>");
			RequestDispatcher rd = request.getRequestDispatcher("product_list.jsp");
			rd.include(request, response);
			}
			else {
				out.println("<h4 style='color:red;text-align:center'>login first to add data</h4>");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
