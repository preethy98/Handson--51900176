package com.hcl.t15;

import java.util.Scanner;

public class StallDetails {
	public static void main(String args[]) {
		double totalcost1 = 0;
		double totalcost2 = 0;
		Scanner s = new Scanner(System.in);
		StallInfo l = new StallInfo();
		System.out.println("Enter the name of the stall:");
		String name = s.nextLine();
		System.out.println("Enter the detail of the stall:");
		String detail = s.nextLine();
		System.out.println("Enter the owner name of the stall:");
		String ownerName = s.nextLine();
		System.out.println("Enter the type of the stall:");
		String type = s.nextLine();
		System.out.println("Enter the size of the stall in square feet:");
		int sqft = s.nextInt();
		s.nextLine();
		System.out.println("Does the hall have TV?(y/n)");
		String ans = s.nextLine();
		if (ans.equals("y")) {
			System.out.println("Enter the number of TV:");
			int no = s.nextInt();
			totalcost1 = l.computeCost(type, sqft, no);
			System.out.println("Total cost :" + totalcost1);
		} else {
			totalcost2 = l.computeCost(type, sqft);
			System.out.println("Total cost :" + totalcost2);
		}

	}
}
