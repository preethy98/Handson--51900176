package com.hcl.t16;

import java.util.Scanner;

public class AreaCalculation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		CircleShape c=new CircleShape();
		RectangleShape r=new RectangleShape();
		TriangleShape t=new TriangleShape();
		System.out.println("Enter the shape"+"\n"+"1.Circle"+"\n"+"2.Rectangle"+"\n"+"3.Triangle");
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter the radius:");
			double Radius=s.nextDouble();
			c.setRadius(Radius);
			c.computeArea();
			break;
		case 2:
			System.out.println("Enter the length and breadth:");
			double Length=s.nextDouble();
			double Breadth=s.nextDouble();
			r.setLength(Length);
			r.setBreadth(Breadth);
			r.computeArea();
			break;
		case 3:
			System.out.println("Enter the base and height:");
			double Base=s.nextDouble();
			double Height=s.nextDouble();
			t.setBase(Base);
			t.setHeight(Height);
			t.computeArea();
			break;
			default :
				System.out.println("Invalid choice");
		}
	}

}
