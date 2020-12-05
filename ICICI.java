package com.hcl.t21;

public class ICICI  implements MutualFund {
	double amount, interestrate=60;
	int tenure=7;
	
	public ICICI(double amount) {
		super();
		this.amount = amount;
	}
	public  void duration(int years)
	{
		if(tenure==years)
			amount();
	}
	public  void amount()
	 {
		double Amount=((interestrate*amount*tenure)/100);
		System.out.println("ICICI Bank"+"\n"+"You will have return as- "+Amount+"/ in "+tenure+"years");
	 }


}
