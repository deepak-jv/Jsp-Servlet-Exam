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

import com.java.model.userRegister;
import com.java.user.registerdao.registerDao;
import com.java.user.registerdao.registerDaoImpl;


public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("username");
		String password = request.getParameter("password");

		registerDao user = new registerDaoImpl();
		
		
		

		try {
			userRegister ur = user.findByPassword(password);
			if(password.equals(ur.getPassword()) && name.equals(ur.getUsername())) {
				HttpSession hs = request.getSession(false);
				hs.setAttribute("name", name);
				hs.setAttribute("password", password);
				hs.getId();
				
				out.println("<h4 style='color:green;text-align:center'>"+name+" logged in successfully </h4>");

				RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
				rd.include(request, response);
				
				
			}
		
			else {
				out.println("<h4 style='color:red;text-align:center'>invalid credentials, try again..!</h4>");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
