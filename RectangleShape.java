package com.hcl.t16;

public class RectangleShape extends Shape{
	private double length,breadth;
	RectangleShape(){
		
	}
	
	public RectangleShape(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public void computeArea()
	{
		area=(length * breadth);
		String a=String.format("%.2f",area );
		System.out.println("Area of the Rectangle:"+a);
	}

}
