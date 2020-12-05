package com.hcl.t7;
import java.util.*;

public class DeliveryDetails {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		Delivery s = new Delivery();// s is the reference variable for Delivery object
		System.out.println("Enter the over");
		Long over = t.nextLong();
		System.out.println("Enter the runs");
		Long ball = t.nextLong();
		System.out.println("Enter the ball");
		Long runs = t.nextLong();
		t.nextLine();
		System.out.println("Enter the batsman name");
		String batsman = t.nextLine();
		System.out.println("Enter the bowler name");
		String bowler = t.nextLine();
		System.out.println("Enter the NonStriker name");
		String nonStriker = t.nextLine();
		s.setOver(over);
		s.setBall(ball);
		s.setRuns(runs);
		s.setBatsman(batsman);
		s.setBowler(bowler);
		s.setNonStriker(nonStriker);
		System.out.println("Delivery details :"+"\n"+"Over :" + s.getOver() + "\n" + "Ball :" + s.getBall() + "\n" + "Runs :" + s.getRuns() + "\n"
				+ "Batsman :" + s.getBatsman() + "\n" + "Bowler :" + s.getBowler() + "\n" + "NonStriker :"
				+ s.getNonStriker());
	}

}
