package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession hs = request.getSession(false);
		String name = (String) hs.getAttribute("name");
		String password = (String) hs.getAttribute("password");
		

		
		if(hs != null && name != null) {
			hs.invalidate();
		
		out.println("<h3 style='color:red;text-align:center'>Logged out successfully</h3>");
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.include(request, response);
		}
		
		else {
		

				out.println("<h4 style='color:red;text-align:center'>you are not logged in, login first</h4>");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
		}
	
	}

}
