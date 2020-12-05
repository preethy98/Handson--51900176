package com.hcl.t14;

public class FixedAccount extends SavingsAccount{
	private int lockingPeriod;
FixedAccount()
{
	
}
	public FixedAccount(int lockingPeriod) {
		super();
		this.lockingPeriod = lockingPeriod;
	}

	public int getLockingPeriod() {
		return lockingPeriod;
	}

	public void setLockingPeriod(int lockingPeriod) {
		this.lockingPeriod = lockingPeriod;
	}
	
}
