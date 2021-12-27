package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.model.product_detail;
import com.java.product_detail.dao.productDao;
import com.java.product_detail.dao.productDaoImpl;

public class productList extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HttpSession hs = request.getSession(false);
		String name1 = (String) hs.getAttribute("name");
		String password = (String) hs.getAttribute("password");

		productDao p = new productDaoImpl();

		try {

			if (hs != null && name1 != null) {
				List<product_detail> pd = p.getall();
				out.println("<h3>");
				for (product_detail prod : pd) {
					int id = prod.getId();
					String name = prod.getPname();
					int price = prod.getPrice();
					int quantity = prod.getQuantity();
					String vendor = prod.getVendor();
					int waranty = prod.getWarranty();
				}
				RequestDispatcher rd = request.getRequestDispatcher("product_list.jsp");
				rd.include(request, response);

			} else {
				out.println("<h4 style='color:red;text-align:center'>login first, to get access</h4>");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.include(request, response);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
