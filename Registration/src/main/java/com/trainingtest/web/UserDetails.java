package com.trainingtest.web;

public class UserDetails {
	private String user;
	private String pass;
	private String name;
	private String id;
	private String Address;
	@Override
	public String toString() {
		return "user= " + user + ", pass=  " + pass + ", name=" + name + ", id= " + id + ", Address= " + Address
				+ ", usertype= " + usertype + "]";
	}
	public UserDetails(String user, String pass, String name, String id, String address, String usertype) {
		super();
		this.user = user;
		this.pass = pass;
		this.name = name;
		this.id = id;
		Address = address;
		this.usertype = usertype;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	private String usertype;
	


}
