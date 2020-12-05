package com.hcl.t28;

public class ItemType {
	private String name;
	private double deposit;
	private double costperday;

	ItemType() {

	}

	public ItemType(String name, double deposit, double costperday) {
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
		return String.format("%s\t%.1f\t%.1f", this.name, this.deposit, this.costperday);
	}

}
