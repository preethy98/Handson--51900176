package com.hcl.t18;

import java.util.Scanner;

public class Place {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Fort f = null;
		System.out.println("What you want to visit" + "\n" + "Rajmachi" + "\n" + "Shivgadh" + "\n" + "Murud");
		String in = s.nextLine();
		if (in.equals("Rajmachi")) {
			f = new Rajmachi();
			f.distance();
		} else if (in.equals("Shivgadh")) {
			f = new Shivgadh();
			f.distance();
		} else if (in.equals("Murud")) {
			f = new Murud();
			f.distance();
		} else
			System.out.println("Invalid Selection");

	}

}
