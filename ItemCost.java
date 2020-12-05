package com.hcl.t23;

import java.util.Scanner;

public class ItemCost {

	public static void main(String[] args) {

		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the cost of the item for n days");
			int cost = s.nextInt();
			System.out.println("Enter the value of n");
			int no = s.nextInt();
			s.nextLine();
			int value = cost / no;
			System.out.println("The cost of the item for n days :" + value);
		} catch (ArithmeticException a) {
			a.printStackTrace();
		}
	}

}
