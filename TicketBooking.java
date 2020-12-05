package com.hcl.t32;

import java.util.Comparator;

public class TicketBooking implements Comparator<TicketBooking> {
	private String customername;
	private Integer price;

	public TicketBooking() {

	}

	public TicketBooking(String customername, Integer price) {
		super();
		this.customername = customername;
		this.price = price;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public int compare(TicketBooking t1, TicketBooking t2) {
		return t1.getPrice().compareTo(t2.getPrice());
	}

}