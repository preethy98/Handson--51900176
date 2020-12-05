package com.hcl.t20;

public class Rectangle implements Polygon{
	double length,breadth;
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public void calcPeri()
	{
		double perimeter=2*(length+breadth);
		System.out.println("Perimeter of Rectangle :"+perimeter);
	}
public void calcArea()
{
	double area=length*breadth;
	System.out.println("Area of Rectangle :"+area);
}
}
