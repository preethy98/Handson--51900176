package com.hcl.t20;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		Polygon p = null;//p is the reference variable for polygon object
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Breadth & Length Of Square :");
		double length = s.nextDouble();
		double breadth = s.nextDouble();
		System.out.println("Enter Side Value :");
		double side = s.nextDouble();

		p = new Rectangle(length, breadth);
		p.calcPeri();
		p.calcArea();
		p = new Square(side);
		p.calcPeri();
		p.calcArea();
	}

}
