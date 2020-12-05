package com.hcl.t21;

public class HDFC implements MutualFund  {
	double amount, interestrate=49;
	int tenure=6;
	
	public HDFC(double amount) {
		super();
		this.amount = amount;
	}
	public void duration(int years)
	{
		if(tenure==years)
			amount();
	}
	public  void amount()
	 {
		double Amount=((interestrate*amount*tenure)/100);
		System.out.println("HDFC Bank"+"\n"+"You will have return as- "+Amount+"/ in "+tenure+"years");
	 }

}
