package com.hcl.t34;

import java.util.Comparator;

public class Hall implements Comparator<Hall> {
	private String	name,	contactNumber,ownerName;
private	Double costPerDay ;
public Hall() {

}
public Hall(String name, String contactNumber, String ownerName, Double costPerDay) {
	super();
	this.name = name;
	this.contactNumber = contactNumber;
	this.ownerName = ownerName;
	this.costPerDay = costPerDay;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public Double getCostPerDay() {
	return costPerDay;
}
public void setCostPerDay(Double costPerDay) {
	this.costPerDay = costPerDay;
}
@Override
public String toString() {
	return name +"\t" +contactNumber +"\t"+ownerName + "\t"+costPerDay+"\n";
}
@Override
public int compare(Hall h1, Hall h2) {
	return h1.getCostPerDay().compareTo(h2.getCostPerDay());
}

}
