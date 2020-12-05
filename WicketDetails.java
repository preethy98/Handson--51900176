package com.hcl.t5;

import java.util.*;

public class WicketDetails {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Wicket w = new Wicket();// w is the reference variable of Wicket object
		System.out.println("Enter the number of wickets");
		int no = s.nextInt();
		String[] wicket = new String[no]; // wicket is the string object array
		s.nextLine();
		for (int i = 0; i < no; i++) {
			System.out.println("Enter the details of wicket " + (i + 1));
			wicket[i] = s.nextLine();
		}
		System.out.println("Wicket details");// splitting the input using split function
		for (int i = 0; i < wicket.length; i++) {
			String txtline[] = wicket[i].split(",");// txtline is the string array reference to store splitted values
			w.setOver(Long.parseLong(txtline[0]));// setting values
			w.setBall(Long.parseLong(txtline[1]));
			w.setWicketType(txtline[2]);
			w.setPlayerName(txtline[3]);
			w.setBowlerName(txtline[4]);
			System.out.println(
					"Over :" + w.getOver() + "\n" + "Ball :" + w.getBall() + "\n" + "WicketType :" + w.getWicketType()
							+ "\n" + "Player Name :" + w.getPlayerName() + "\n" + "Bowler Name :" + w.getBowlerName());

		} // getting values
	}
}
