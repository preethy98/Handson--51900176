package org.hcl.model;

public class User {
	int userid;
	String username,password,gender,designation;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int userid, String username, String password, String gender, String designation) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.designation = designation;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
