package com.java.product_detail.dao;
import java.sql.SQLException;
import java.util.List;

import com.java.model.product_detail;

public interface productDao {

	public product_detail findById(int id) throws SQLException;
	public int save(product_detail u) throws SQLException;
	public int update(product_detail u) throws SQLException;
	public int delete(product_detail u) throws SQLException;
	public List<product_detail> getall() throws SQLException;

		
	
}
