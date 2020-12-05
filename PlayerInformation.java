package com.hcl.t3;
import java.util.*;

public class PlayerInformation{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the player details");
		String txt = s.nextLine();
		String[] txtlist = txt.split(",");
		String name = txtlist[0];
		String country = txtlist[1];
		String skill = txtlist[2];
		Player t = new Player(name, country, skill);
		System.out.println("Player details");
		System.out.println("Player Name :" + t.name + "\n" + "Country Name :" + t.country + "\n" + "Skill :" + t.skill);
	}

}
