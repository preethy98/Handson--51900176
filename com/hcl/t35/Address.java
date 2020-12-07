package com.hcl.t35;
public class Address implements Comparable<Address> {
	 String username,addressLine1,addressLine2;
	 Integer pinCode ;
	 public Address() {
		
	}
	public Address(String username, String addressLine1, String addressLine2, Integer pinCode) {
		super();
		this.username = username;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pinCode = pinCode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public int compareTo(Address o) {
		if(o.getPinCode()==this.pinCode)
			return this.getAddressLine1().compareTo(o.getAddressLine1());
		else
		return this.pinCode.compareTo(o.getPinCode());
	}
	@Override
	public String toString() {
		return  username +","+ addressLine1+"," + addressLine2+","+pinCode ;
	} 
	 
}
