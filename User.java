package com.hcl.task4;

public class User {
	String name,userName,email,contactNumber;
	public User() {

	}
	public User(String name, String userName, String email, String contactNumber) {
		super();
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.contactNumber = contactNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	 @Override
	public String toString() {
		return name +"\t"+userName +"\t"+email +"\t"+ contactNumber;
	}
	void display()
	 {
	toString();
	}
}

