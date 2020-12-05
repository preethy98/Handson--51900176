package com.hcl.collections;

//import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HallDetails {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name, contactNumber, ownerName;
		Double costPerDay;
		List<Hall> hall = new LinkedList<>();
		System.out.println("Enter the number of halls: ");
		int no = s.nextInt();
		s.nextLine();
		for (int i = 0; i < no; i++) {
			System.out.println("Enter the details of hall " + (i + 1));
			String[] line=s.nextLine().split(",");
			name=line[0];
			contactNumber=line[1];
			ownerName=line[2];
			costPerDay =Double.parseDouble(line[3]);
			hall.add(new Hall(name, contactNumber, ownerName, costPerDay));
		}
		System.out.println("Name " + " Contact number" + " Costperday" + " Owner name");
Collections.sort(hall,new Hall());
for(Hall h:hall)
System.out.println(h);
}
}