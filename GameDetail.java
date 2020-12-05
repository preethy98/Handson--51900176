package com.hcl.t6;
import java.util.*;

public class GameDetail {
	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		System.out.println("Enter the over");
		Long over = t.nextLong();
		System.out.println("Enter the ball");
		Long ball = t.nextLong();
		System.out.println("Enter the runs");
		Long runs = t.nextLong();
		t.nextLine();
		System.out.println("Enter the batsman name");
		String batsman = t.nextLine();
		System.out.println("Enter the bowler name");
		String bowler = t.nextLine();
		System.out.println("Enter the nonStriker name");
		String nonStriker = t.nextLine();
		Game s = new Game(over, ball, runs, batsman, bowler, nonStriker);
		s.displayDeliveryDetails();
	}

}
