package com.java.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class dbUtility {

	private static Connection cn;

	static {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_db?user=root&password=root");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public boolean test_db() {

		if (cn != null)
			return true;
		else
			return false;
	}
	
	public PreparedStatement Create(String sql) throws SQLException {
		
		return cn.prepareStatement(sql);	}
	
	public int update(PreparedStatement ps) throws SQLException {
		
		return ps.executeUpdate();
		
	}
	public ResultSet query(PreparedStatement ps) throws SQLException {
		
		return ps.executeQuery();
	}

}
