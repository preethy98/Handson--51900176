package com.hcl.t24;

import java.util.Scanner;

public class ItemDetails {

	public static void main(String[] args) {
		String name, deposit1, costperday1;
		try {
			Scanner s = new Scanner(System.in);

			System.out.println("Enter the item type details :" + "\n" + "Enter the Name :");
			name = s.nextLine();
			System.out.println("Enter the deposit :");
			deposit1 = s.nextLine();
			Double deposit = Double.valueOf(deposit1);
			System.out.println("Enter the costperday :");
			costperday1 = s.nextLine();
			Double costperday = Double.valueOf(costperday1);
			Item item = new Item(name, deposit, costperday);
			System.out.println(item);
		} catch (NumberFormatException a) {
			a.printStackTrace();
		}
	}
}
