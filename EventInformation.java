package com.hcl.t17;

import java.util.Scanner;

public class EventInformation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Exhibition e = new Exhibition();
		StageEvent t = new StageEvent();
		System.out.println("Enter the name of the Stall :");
		String name = s.nextLine();
		System.out.println("Enter the detail of the Stall :");
		String detail = s.nextLine();
		System.out.println("Enter the OwnerName of the Stall :");
		String ownerName = s.nextLine();
		System.out.println("Enter the Stall Type :" + "\n" + "1.Exhibition" + "\n" + "2.StageEvent");
		int ch = s.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter the No of Stall :");
			int stall = s.nextInt();
			e.setNoOfStall(stall);
			e.projectedRevenue();
			break;
		case 2:
			System.out.println("Enter the No of Shows :");
			int shows = s.nextInt();
			System.out.println("Enter the No of Seats per Show :");
			int seat = s.nextInt();
			t.setNoOfShows(shows);
			t.setNoOfSeatperShow(seat);
			t.projectedRevenue();
			break;
		default:
			System.out.println("Invalid Statement");
			break;
		}

	}

}
