package com.java.user.registerdao;

import java.sql.SQLException;

import com.java.model.userRegister;


public interface registerDao {
	
	public int save(userRegister u) throws SQLException ;
	public userRegister findByPassword(String password) throws SQLException;

}
