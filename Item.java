package com.hcl.t24;

public class Item {
	String name;
	double deposit, costperday;

	Item() {

	}

	public Item(String name, double deposit, double costperday) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costperday = costperday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getCostperday() {
		return costperday;
	}

	public void setCostperday(double costperday) {
		this.costperday = costperday;
	}

	@Override
	public String toString() {
		return "The items to be displayed " + "\n" + "Name :" + name + "\n" + "Deposit :" + deposit + "\n"
				+ "costperday :" + costperday;
	}

}
