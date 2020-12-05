package com.hcl.t31;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UserInformation {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);// s is reference variable for scanner object
Set set=new LinkedHashSet();
String reply;
do {//Entering usernames in Set till reply comes n(no)
System.out.println("Enter the username :");
set.add(s.nextLine());
System.out.println("Do you want to continue ?(y/n)");
reply=s.nextLine();
if(reply.equals("n"))
	break;
}while(reply.equals("y"));
System.out.println("Number of Users "+set.size());//Calculating the user size with size method
}


}
