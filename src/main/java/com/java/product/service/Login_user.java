package com.java.product.service;

import java.sql.SQLException;

import com.java.model.userRegister;
import com.java.servlet.Login;
import com.java.user.registerdao.registerDao;
import com.java.user.registerdao.registerDaoImpl;

public class Login_user {

	
	public static void mian(String[] args) throws SQLException {
		
		Login l = new Login();
		
	String password = l.getInitParameter("password");
	registerDao user = new registerDaoImpl();
	userRegister u = user.findByPassword(password);
	
	
	}
}
