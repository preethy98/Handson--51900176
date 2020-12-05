package com.hcl.t4;

import java.util.*;

public class SportsmanDetail {
	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		System.out.println("Enter the player name");
		String name = t.nextLine();
		System.out.println("Enter the country name");
		String country = t.nextLine();
		System.out.println("Enter the skill");
		String skill = t.nextLine();
		System.out.println("Player details");
		Sportsman s = new Sportsman(name, country, skill);
		System.out.println("Player Name :" + s.name + "\n" + "Country Name :" + s.country + "\n" + "Skill :" + s.skill);

	}
}