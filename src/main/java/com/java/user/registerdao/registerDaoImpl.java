package com.java.user.registerdao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.db.dbUtility;
import com.java.model.userRegister;
import com.java.model.userlogin;

public class registerDaoImpl implements registerDao {
	PreparedStatement ps;
	ResultSet rs;
	dbUtility db = new dbUtility();
	public int save(userRegister u) throws SQLException {
	String	sql = "insert into register_user (name,contact,email,user_name,password) value(?,?,?,?,?)";
	ps = db.Create(sql);
	ps.setString(1, u.getName());
	ps.setString(2, u.getContact());
	ps.setString(3, u.getEmail());
	ps.setString(4, u.getUsername());
	ps.setString(5, u.getPassword());
	
	return db.update(ps);
	}

	public userRegister findByPassword(String password) throws SQLException {
		String sql = "select user_name,password from register_user where password=?";
		ps = db.Create(sql);
		ps.setString(1, password);
		rs = db.query(ps);
		
		userRegister u = new userRegister();
		if(rs.next()) {
		u.setUsername(rs.getString("user_name"));
		u.setPassword(rs.getString("password"));
		
		}
		return  u;	
	}


}
