package com.hcl.t32;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Booking {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int no = 0;
		List<TicketBooking> l = new ArrayList<>();
		String[] split = null;
		String customername = null;
		Integer price;
		System.out.println("Enter the number of customers");
		no = s.nextInt();
		String[] store = new String[no];
		s.nextLine();
		System.out.println("Enter the booking price accordingly with customer name in CSV(Customer Name,Price)");
		for (int i = 0; i < no; i++) {
			store[i] = s.nextLine();
			split = store[i].split(",");//splitting the values and adding in list
			customername = split[0];
			price = Integer.valueOf(split[1]);
			l.add(new TicketBooking(customername, price));
		}
		TicketBooking min = Collections.min(l, new TicketBooking());
		TicketBooking max = Collections.max(l, new TicketBooking());
		System.out.println(min.getCustomername() + " spends minimum amount of " + min.getPrice());
		System.out.println(max.getCustomername() + " spends maximum amount of " + max.getPrice());
	}
}
