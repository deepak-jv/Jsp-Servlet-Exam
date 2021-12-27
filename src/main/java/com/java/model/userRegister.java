package com.java.model;

public class userRegister {

	private String name;
	private String contact;
	private String email;
	private String username;
	private String password;
	public userRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	public userRegister(String name, String contact, String email, String username, String password) {
		super();
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
