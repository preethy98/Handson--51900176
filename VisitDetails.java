package com.hcl.t1;

import java.util.*;

public class VisitDetails {
	public static void main(String args[]) { 
		Scanner t = new Scanner(System.in);//t is the reference variable for scanner object
		System.out.println("Enter the venue name");
		String name = t.nextLine();
		System.out.println("Enter the city name");
		String city = t.nextLine();
		System.out.println("Venue details:");
		Visit v = new Visit(name, city);//v is the reference variable for Venue object
		System.out.println("Venue Name :" + v.name + "\n" + "City Name :" + v.city);//output

	}
}
