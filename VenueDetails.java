package com.hcl.t2;
import java.util.*;
public class VenueDetails {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);//s is the reference variable for Scanner object
		Venue v = new Venue();// v is the reference variable for Venue object
		System.out.println("Enter the venue name");
		String name = s.nextLine();
		v.setName(name);
		System.out.println("Enter the city name");
		String city = s.nextLine();
		v.setCity(city);
		int ch = 0;
		do {
			System.out.println(
					"Venue Details" + "\n" + "Venue Name :" + v.getName() + "\n" + "City Name :" + v.getCity());
			System.out.println("Menu" + "\n" + "1.Update Venue Name" + "\n" + "2.Update City Name" + "\n"
					+ "All informations Correct/Exit");
			System.out.println("Type 1 or 2 or 3");
			ch = s.nextInt();
			s.nextLine();
			switch (ch) {
			case 1:
				System.out.println("Enter the venue name");
				String newname = s.nextLine();
				v.setName(newname);
				break;
			case 2:
				System.out.println("Enter the city name");
				String newcity = s.nextLine();
				v.setCity(newcity);
				break;
			case 3:
				System.out.println("Venue Details" + "\n" + "Venue Name :" + v.getName() + "\n" + "City Name :" + v.getCity());
			break;
			}
		} while (ch != 3);
	}

}
