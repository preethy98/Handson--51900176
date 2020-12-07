package com.hcl.t38;

public class User implements Comparable<User> {
	private String name,email,username,password;
	 public User() {
		
	}
	public User(String name, String email, String username, String password) {
		super();
		this.name = name;
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
	@Override
	public String toString() {
		return  name +"\t"+  email +"\t" + username +"\t"  + password ;
	}

@Override
public int compareTo(User u1) {
	
	return this.getName().compareTo(u1.getName());
}

}
