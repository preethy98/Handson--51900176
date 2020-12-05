package com.hcl.t20;

public class Square implements Polygon {
	double side;
	
	public Square(double side) {
		super();
		this.side = side;
	}
	public void calcPeri()
	{
		double perimeter=4*side;
		System.out.println("Perimeter of Square :"+perimeter);
	}
public void calcArea()
{
	double area=side*side;
	System.out.println("Area of the Square :"+area);
}
}
