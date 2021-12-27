package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.model.product_detail;
import com.java.model.userRegister;
import com.java.product_detail.dao.productDao;
import com.java.product_detail.dao.productDaoImpl;
import com.java.user.registerdao.registerDao;
import com.java.user.registerdao.registerDaoImpl;

public class Register extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException,NumberFormatException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		registerDao u = new registerDaoImpl();
		userRegister user = new userRegister();

		try {
			userRegister usr = u.findByPassword(password);
			
			if (password.equals(usr.getPassword())) {
				out.println("<h4 style='color:red;text-align:center'>Password is already taken, try again..!</h4>");
				RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
				rd.include(request, response);
			}
			
			else {
				user.setPassword(password);
				user.setName(name);
				user.setContact(contact);
				user.setEmail(email);
				user.setUsername(username);

				u.save(user);
				out.println("<h4 style='color:green;text-align:center'>You registered Successfully!</h4>");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
