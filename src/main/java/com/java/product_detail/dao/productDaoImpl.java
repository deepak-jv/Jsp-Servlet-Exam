package com.java.product_detail.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.db.dbUtility;
import com.java.model.product_detail;

public class productDaoImpl implements productDao {
	dbUtility db = new dbUtility();
	PreparedStatement ps;
	ResultSet rs;

	public int save(product_detail u) throws SQLException {
		String sql = "insert into product_management(product_name,price,vendor,quantity,waranty) value(?,?,?,?,?)";
		ps = db.Create(sql);
		ps.setString(1, u.getPname());
		ps.setInt(2, u.getPrice());
		ps.setString(3, u.getVendor());
		ps.setInt(4, u.getQuantity());
		ps.setInt(5, u.getWarranty());
		return db.update(ps);
	}

	public int update(product_detail u) throws SQLException {
		String sql = "update product_management set product_name=?,price=?,vendor=?,quantity=?,waranty=? where product_id=?";
		ps = db.Create(sql);
		ps.setString(1, u.getPname());
		ps.setInt(2, u.getPrice());
		ps.setString(3, u.getVendor());
		ps.setInt(4, u.getQuantity());
		ps.setInt(5, u.getWarranty());
		ps.setInt(6, u.getId());
		return db.update(ps);
	}



	public int delete(product_detail u) throws SQLException {
		String sql = "delete from product_management where product_id=?";
		ps = db.Create(sql);
		ps.setInt(1, u.getId());
		
		return db.update(ps);
	}

	public List<product_detail> getall() throws SQLException {
		String sql = "select * from product_management";
		ps = db.Create(sql);
		rs = db.query(ps);
		List<product_detail> products = new ArrayList();
		
		while(rs.next()) {
			product_detail p = new product_detail();
			p.setId(rs.getInt("product_id"));
			p.setPname(rs.getString("product_name"));
			p.setPrice(rs.getInt("price"));
			p.setVendor(rs.getString("vendor"));
			p.setQuantity(rs.getInt("quantity"));
			p.setWarranty(rs.getInt("waranty"));
			products.add(p);
			
		}
		
		return products;	
	}

	public product_detail findById(int id) throws SQLException {

		String sql = "select * from product_management where product_id=?";
		ps = db.Create(sql);
		ps.setInt(1, id);
		rs = db.query(ps);
		
		product_detail p = new product_detail();
		if(rs.next()) {
		p.setId(rs.getInt("product_id"));
		p.setPname(rs.getString("product_name"));
		p.setPrice(rs.getInt("price"));
		p.setVendor(rs.getString("vendor"));
		p.setQuantity(rs.getInt("quantity"));
		p.setWarranty(rs.getInt("waranty"));
		
		}
		return  p;
		
	}

	}

