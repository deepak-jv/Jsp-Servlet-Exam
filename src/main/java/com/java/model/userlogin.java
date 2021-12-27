package com.java.model;

public class userlogin {

	private String name;
	private String password;
	public userlogin(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public userlogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
