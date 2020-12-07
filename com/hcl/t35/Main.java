package com.hcl.t35;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String username, addressLine1, addressLine2;
		Integer pinCode;
		List<Address> address= new ArrayList<>();
		System.out.println("Enter the number of users :");
		int no = s.nextInt();
		s.nextLine();
		System.out.println("Enter user address in CSV(Username,AddressLine 1,AddressLine 2,PinCode");
		for (int i = 0; i < no; i++) {
			String[] user = s.nextLine().split(",");
			username = user[0];
			addressLine1 = user[1];
			addressLine2 = user[2];
			pinCode = Integer.parseInt(user[3]);
			address.add(new Address(username, addressLine1, addressLine2, pinCode));
		}
		System.out.println("User Details :");
		Collections.sort(address);
		for (Address users : address)
			System.out.println(users);
	}
}
