package com.hcl.t14;

public class SavingsAccount extends Account {
	protected double minimumBalance;

	SavingsAccount()
	{
		
	}
	public SavingsAccount(double minimumBalance) {
		super();
		this.minimumBalance = minimumBalance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	

}
