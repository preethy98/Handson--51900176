package com.hcl.t38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name, email, username, password;
		List<User> user = new ArrayList<>();
		System.out.println("Enter the number of user details :");
		int no = s.nextInt();
		s.nextLine();
		for (int i = 0; i < no; i++) {
			System.out.println("Enter the user" + (i + 1) + " detail");
			String[] users = s.nextLine().split(",");
			name = users[0];
			email = users[1];
			username = users[2];
			password = users[3];
			user.add(new User(name, email, username, password));
		}
		System.out.println("Searchby" + "\n" + "1. byName" + "\n" + "2. byEmail");
		int ch = s.nextInt();
		s.nextLine();
		System.out.println("Name " + " Email" + " Username" + " Password");
		switch (ch) {
		case 1:
			System.out.println("Enter the Name ");
			String searchName = s.nextLine();
			User x = new User();
			x.setName(searchName);
			int index = Collections.binarySearch(user, x);
			if (index >= 0)
				System.out.println(user.get(index));
			else
				System.out.println("Name Not found");
			break;
		case 2:
			System.out.println("Enter the Email ");
			String searchEmail = s.nextLine();
			User y = new User();
			y.setEmail(searchEmail);
			int indx = Collections.binarySearch(user, y,new EmailComparator());
			if (indx >= 0)
				System.out.println(user.get(indx));
			else
				System.out.println("Email Not Found");
			break;
		default:
			System.out.println("Invalid choice");
		}
	}

}
