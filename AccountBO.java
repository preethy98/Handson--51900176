package com.hcl.t14;

public  class AccountBO extends FixedAccount
{
	
		public  FixedAccount getAccountDetail(String detail)
		{
			
			FixedAccount fixed=new FixedAccount();
			String[] det=detail.split(",");
			String accountNumber=det[0];
			double balance=Double.parseDouble(det[1]);
			String accountHolderName=det[2];
			double minbalance=Double.parseDouble(det[3]);
			int lockingperiod=Integer.parseInt(det[4]);
			fixed.setAccountHolderName(accountHolderName);
			fixed.setAccountNumber(accountNumber);
			fixed.setMinimumBalance(minbalance);
			fixed.setLockingPeriod(lockingperiod);
			fixed.setBalance(balance);
			return fixed;
		}
	}


