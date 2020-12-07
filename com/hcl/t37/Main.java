package com.hcl.t37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name,email,username,password;
		List<User> user=new ArrayList<>();
		System.out.println("Enter the number of user details :");
		int no=s.nextInt();
		s.nextLine();
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter the user"+(i+1)+" detail");
			String[] users=s.nextLine().split(",");
			name=users[0];
			email=users[1];
			username=users[2];
			password=users[3];
			user.add(new User(name,email,username,password));
		}
System.out.println("The user details in reverse order:"+"\n"+"Name "+" Mobile"+ "number");
		Collections.reverse(user);
		for(User u:user)
			System.out.println(u);
	}

}
