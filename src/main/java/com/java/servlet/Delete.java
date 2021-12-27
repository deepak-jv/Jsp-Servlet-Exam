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

public class Delete extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		

		HttpSession hs = request.getSession(false);
		String name1 = (String) hs.getAttribute("name");
		String password = (String) hs.getAttribute("password");
		
		
		productDao pd = new productDaoImpl();
		product_detail p = new product_detail();
		int id = Integer.parseInt(request.getParameter("id"));
				
		p.setId(id);
		try {
			if(hs!=null && name1!=null) {
			pd.delete(p);
			out.println("<h4 style='color:red;text-align:center'>data deleted successfully</h4>");
			RequestDispatcher rd = request.getRequestDispatcher("product_list.jsp") ;
			rd.include(request, response);
			}
			
			else {
				out.println("<h4 style='color:red;text-align:center'>login first to delete data</h4>");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
