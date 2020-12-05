package com.hcl.t19;

import java.util.Scanner;

public class StallInformation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StallType st=null;
		System.out.println("Choose Stall Type :"+"\n"+"1.GoldStall"+"\n"+"2.PremiumStall"+"\n"+"3.ExecutiveStall");
int in=s.nextInt();
s.nextLine();
switch(in)
{
case 1:
	String txt1=s.nextLine();
	String[] txtline1=txt1.split(",");
	String stallname1=txtline1[0];
	int cost1=Integer.parseInt(txtline1[1]);
	String ownername1=txtline1[2];
	int tvset1=Integer.parseInt(txtline1[3]);
	st=new GoldStall(stallname1,ownername1,cost1,tvset1);
	st.display();
	break;
case 2:
	String txt2=s.nextLine();
	String[] txtline2=txt2.split(",");
	String stallname2=txtline2[0];
	int cost2=Integer.parseInt(txtline2[1]);
	String ownername2=txtline2[2];
	int projector=Integer.parseInt(txtline2[3]);
	st=new PremiumStall(stallname2,ownername2,cost2,projector);
	st.display();
	break;
case 3:
	String txt3=s.nextLine();
	String[] txtline3=txt3.split(",");
	String stallname3=txtline3[0];
	int cost3=Integer.parseInt(txtline3[1]);
	String ownername3=txtline3[2];
	int screen=Integer.parseInt(txtline3[3]);
	st=new ExecutiveStall(stallname3,ownername3,cost3,screen);
	st.display();
	break;
	
}
	}

}
