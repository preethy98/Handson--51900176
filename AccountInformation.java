package com.hcl.t14;

import java.util.Scanner;

public class AccountInformation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		AccountBO account = new AccountBO();
		FixedAccount f = null;
		System.out.println("Enter the Account details :");
		String detail = s.nextLine();
		f = account.getAccountDetail(detail);
		System.out.println("Account Details :" + "\n" + "Account Number" + "\t" + "  Balance " + "\t"
				+ "Account Holder Name" + "\t" + "  Minimum balance" + "\t" + "  Locking period");
		System.out.println(f.getAccountNumber() + "\t" + f.getBalance() + "\t" + f.getAccountHolderName() + "\t"
				+ f.getMinimumBalance() + "\t" + f.getLockingPeriod());
	}
}
//ACC001,5456.45,Tony Blake,500,10