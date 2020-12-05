package com.hcl.t21;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		MutualFund mf=null;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount you want to invest :");
		double amount=s.nextDouble();
		System.out.println("Enter the tenure of the SIP");
		int years =s.nextInt();
		mf=new AxisBank(amount);
		mf.duration(years);
		mf=new HDFC(amount);
		mf.duration(years);
		mf=new ICICI(amount);
		mf.duration(years);
			
		

	}

}
