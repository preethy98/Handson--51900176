package com.hcl.t16;

public class TriangleShape extends Shape {
private double base,height;
TriangleShape()
{
	
}

public TriangleShape(double base, double height) {
	super();
	this.base = base;
	this.height = height;
}

public double getBase() {
	return base;
}

public void setBase(double base) {
	this.base = base;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}

public void computeArea()
{
	area=(0.5*base*height);
	String b=String.format("%.2f", area);
	System.out.println("Area of the Triangle is:"+b);
}
}
