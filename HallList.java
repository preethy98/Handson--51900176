package com.hcl.t29;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HallList {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	List<String> l=new ArrayList();
	System.out.println("Enter the number of Halls :");
	int no=s.nextInt();
	s.nextLine();
	for(int i=0;i<no;i++)
	{
	System.out.println("Enter the Hall Name "+(i+1));
	String hname=s.nextLine();// hname refers the hall name
	l.add(hname);
	}
System.out.println("Enter the hallname to be searched");
String search=s.nextLine();  //search refers the hall name to be searched
if(l.contains(search))
	System.out.println(search +"hall is found in the list at position"+l.indexOf(search));
	
	}
}
