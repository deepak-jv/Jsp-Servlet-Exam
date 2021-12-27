package com.java.model;

public class product_detail {
	private int id;
	private String pname;
	private int price;
	private int quantity;
	private String vendor;
	private int warranty;
	public product_detail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public product_detail(int id,String pname, int price, int quantity, String vendor, int warranty) {
		super();
		this.id = id;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
		this.vendor = vendor;
		this.warranty = warranty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	
	
}
