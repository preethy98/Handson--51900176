package com.hcl.t16;

public class CircleShape extends Shape{
private double radius;
double pi=3.14;
CircleShape(){
	
}

public CircleShape(double radius) {
	super();
	this.radius = radius;
}

public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}

public void computeArea()
{
	area=pi*radius*radius;
	String d=String.format("%.2f",area);
	System.out.println("Area of the circle is :"+d);
}
}
