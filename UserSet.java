package com.hcl.t30;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserSet {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//s is the reference variable for Scanner
		Set set = new HashSet();//Hashset is the implementation class implementing set interface
		String reply;
		do {  //Entering username and adding in set till reply comes n(no)
			System.out.println("Enter the username :");
			set.add(s.nextLine());
			System.out.println("Do you want to continue ?(y/n)");
			reply = s.nextLine();
		} while (reply.equals("y"));
		System.out.println("The unique number of usernames is" + set.size());//Calculating size using size method
	}
}
