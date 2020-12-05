package com.hcl.t6;

public class Game {
	Long over, ball, runs;
	String batsman, bowler, nonStriker;

	Game(Long over, Long ball, Long runs, String batsman, String bowler, String nonStriker) {
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonStriker = nonStriker;
	}

	void displayDeliveryDetails() {
		System.out.println("Delivery details");
		System.out.println("Over :" + over + "\n" + "Ball :" + ball + "\n" + "Runs :" + runs + "\n" + "Batsman :"
				+ batsman + "\n" + "Bowler :" + bowler + "\n" + "NonStriker :" + nonStriker);

	}
}
