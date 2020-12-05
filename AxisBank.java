package com.hcl.t21;

public class AxisBank implements MutualFund {
	double amount, interestrate=56;
int tenure=5;
	public AxisBank(double amount) {
		super();
		this.amount = amount;
	}
	public void duration(int years)
	{
		if(tenure==years)
			amount();
	}
	public void amount()
	 {
		double Amount=((interestrate*amount*tenure)/100);
		System.out.println("Axis Bank"+"\n"+"You will have return as- "+Amount+"/ in "+tenure+"years");
	 }
}