package com.hcl.t26;

public class EventType {
private String name;
private Long id;
public EventType() {

}
public EventType(String name, Long id) {
	super();
	this.name = name;
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
@Override
public String toString() {
	return  name + id;
}



}
