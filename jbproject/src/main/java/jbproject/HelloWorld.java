package jbproject;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
private String message;
public HelloWorld() {
	// TODO Auto-generated constructor stub
}
public HelloWorld(String message) {
	super();
	this.message = message;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}

}
