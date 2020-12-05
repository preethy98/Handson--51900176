package com.hcl.t17;

public class Exhibition extends EventInfo{
	int noOfStall;

	Exhibition() {

	}

	public Exhibition(int noOfStall) {
		super();
		this.noOfStall = noOfStall;
	}

	public int getNoOfStall() {
		return noOfStall;
	}

	public void setNoOfStall(int noOfStall) {
		this.noOfStall = noOfStall;
	}

	void projectedRevenue() // considering cost of one stall to be Rs 10000
	{
		int revenue = noOfStall * 10000;
		System.out.println("Total Revenue of Exhibition :" + revenue);
	}
}
