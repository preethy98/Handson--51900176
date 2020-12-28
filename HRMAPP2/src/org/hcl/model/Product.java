package org.hcl.model;

public class Product {
private int pid;
private String pname,imageurl,description;
private int price;
public Product() {
	// TODO Auto-generated constructor stub
}
public Product(int pid, String pname, String imageurl, String description, int price) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.imageurl = imageurl;
	this.description = description;
	this.price = price;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getImageurl() {
	return imageurl;
}
public void setImageurl(String imageurl) {
	this.imageurl = imageurl;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}
