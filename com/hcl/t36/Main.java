package com.hcl.t36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name,email,username,password;
		User use=new User();
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
System.out.println("Sortby"+"\n"+"1. byName"+"\n"+"2. byEmail");
int ch=s.nextInt();
System.out.println("Name "+" Email"+" Username"+" Password");
switch(ch)
{
case 1:
	Collections.sort(user,use.byname);
	for(User u:user)
		System.out.println(u);
	break;
case 2:
	Collections.sort(user,use.byEmail);
	for(User v:user)
		System.out.println(v);
	break;
}
	}

}
