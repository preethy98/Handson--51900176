package com.hcl.t17;

public class StageEvent extends EventInfo {
	int noOfShows,noOfSeatperShow;
	StageEvent()
	{
		
	}
	public StageEvent(int noOfShows, int noOfSeatperShow) {
		super();
		this.noOfShows = noOfShows;
		this.noOfSeatperShow = noOfSeatperShow;
	}
	public int getNoOfShows() {
		return noOfShows;
	}
	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}
	public int getNoOfSeatperShow() {
		return noOfSeatperShow;
	}
	public void setNoOfSeatperShow(int noOfSeatperShow) {
		this.noOfSeatperShow = noOfSeatperShow;
	}
	void projectedRevenue()            //considering cost per stall be Rs 10000 and cost per set Rs 500
	{
		int revenue=noOfShows*10000+noOfSeatperShow*500;
		System.out.println("Total Revenue of StageEvent :"+revenue);
	}
	

}
