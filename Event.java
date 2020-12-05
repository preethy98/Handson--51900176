package com.hcl.t26;

public class Event {
	String name,detail,ownerName;
Long typeId;
Event()
{
	
}
public Event(String name, String detail, String ownerName, Long typeId) {
	super();
	this.name = name;
	this.detail = detail;
	this.ownerName = ownerName;
	this.typeId = typeId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public Long getTypeId() {
	return typeId;
}
public void setTypeId(Long typeId) {
	this.typeId = typeId;
}
@Override
public String toString() {
	return  name  +"\t"+ detail + "\t"+ownerName +"\t"+typeId;
}

}
