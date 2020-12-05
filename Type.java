package com.hcl.t8;
import java.util.*;

public class Type {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		ExtraType e = new ExtraType();// e is the reference variable for ExtraType
		System.out.println("Enter the extratype details");
		String txt = s.nextLine();
		String[] txtline = txt.split("#");// splitting using split function
		e.setName(txtline[0]);
		e.setRuns((Long.parseLong(txtline[1])));
		System.out.println("Extra type details");
		System.out.println("ExtraType :" + e.getName() + "\n" + "Runs :" + e.getRuns());
	}

}
