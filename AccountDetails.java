package com.hcl.t13;
import java.util.*;
public class AccountDetails {

	public static void main(String[] args) {
		CurrentAccountInfo c=new CurrentAccountInfo();
		SavingsAccountInfo a=new SavingsAccountInfo();
		Scanner s=new Scanner(System.in);
		System.out.println("Choose Account Type"+"\n"+"1.SavingsAccount"+"\n"+"2.Current Account");
		int type=s.nextInt();
		s.nextLine();
		System.out.println("Enter Account details");
		String details=s.nextLine();
		switch(type)
		{
		case 1:
			String[] txtline1=details.split(",");
			a.setAccName(txtline1[0]);
			a.setAccNo(txtline1[1]);
			a.setBankName(txtline1[2]);
			a.setOrgName(txtline1[3]);
			a.display();
			break;
		case 2:
			String[] txtline2=details.split(",");
			c.setAccName(txtline2[0]);
			c.setAccNo(txtline2[1]);
			c.setBankName(txtline2[2]);
			c.setPinNumber(txtline2[3]);
			c.display();
			break;
			
		}
		
		

	}

}
