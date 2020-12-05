package com.hcl.t28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemTypeTest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=1;
		String name,reply;
		double deposit,costperday;
		ItemType item=new ItemType();
		List<ItemType> l=new ArrayList();
		do {         //Entering the itemtype till replay becomes n(no)
System.out.println("Enter the details of Item Type "+i);
System.out.println("Name :");
name=s.nextLine();
System.out.println("Deposit :");
deposit=s.nextDouble();
System.out.println("Costperday :");
costperday=s.nextDouble();
l.add(new ItemType(name,deposit,costperday));
s.nextLine();
System.out.println("Do you want to continue?(y/n)");
reply=s.nextLine();
i++;
	}
while(reply.equals("y"));
		System.out.println("Name "+"\t"+"Deposit "+"Costperday");
		for(ItemType t:l)
			System.out.println(t);
	}
}
