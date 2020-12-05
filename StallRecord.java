package com.hcl.t33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StallRecord {

	public static void main(String[] args) throws IllegalStateException, NoSuchElementException {
		Scanner s = new Scanner(System.in);// s is the reference variable for Scanner object
		List<Stall> stall = new ArrayList<>();
		String name, detail, type, ownerName, str = "test";
		int no = 0;
		System.out.println("Enter the number of stall details");
		no = s.nextInt();
		s.nextLine();
		for (int i = 0; i < no; i++) {//Splitting the CSV values 
			System.out.println("Enter the stall name " + (i + 1));
			String[] details = s.nextLine().split(",");
			name = details[0];
			detail = details[1];
			type = details[2];
			ownerName = details[3];
			stall.add(new Stall(name, detail, type, ownerName));
		}
		Iterator<Stall> itr = stall.iterator();//Iteratoring the list of stall
		System.out.println("Name" + " Detail" + " Type" + " OwnerName");
		while (itr.hasNext()) {
			if (itr.next().getName().startsWith(str)) {
				itr.remove();
			}
		}
		for (Stall s1 : stall)
			System.out.println(s1);
	}
}
