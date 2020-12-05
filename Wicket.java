package com.hcl.t5;

public class Wicket {
	Long over, ball;
	String wicketType, playerName, bowlerName;

	Wicket() {//non parameterized constructor

	}

	public Wicket(Long over, Long ball, String wicketType, String playerName, String bowlerName) {
		this.over = over;
		this.ball = ball;             //parameterized constructor for initialisation
		this.wicketType = wicketType;
		this.playerName = playerName;
		this.bowlerName = bowlerName;
	}

	public Long getOver() {// mutators and accessors to set and get values
		return over;
	}

	public void setOver(Long over) {
		this.over = over;
	}

	public Long getBall() {
		return ball;
	}

	public void setBall(Long ball) {
		this.ball = ball;
	}

	public String getWicketType() {
		return wicketType;
	}

	public void setWicketType(String wicketType) {
		this.wicketType = wicketType;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getBowlerName() {
		return bowlerName;
	}

	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}

}
