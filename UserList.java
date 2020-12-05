package com.hcl.t27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserList {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<String> l = new ArrayList();
		int i = 1;
		String reply = null;
		do {                   //Entering the username and adding in list till replay comes n(no)
			System.out.println("Enter the username " + i);
			l.add(s.nextLine());
			System.out.println("Do you want to continue?(y/n) ");
			reply = s.nextLine();
			i++;
			if(reply.equals("n"))
			break;
		} while (reply.equals("y"));
		System.out.println("The names entered are :" + "\n");
		for (String details : l)
			System.out.println(details);
	}
}
