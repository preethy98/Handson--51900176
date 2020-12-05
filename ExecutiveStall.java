package com.hcl.t19;

public class ExecutiveStall implements StallType {
	private String stallName,ownerName;
	private int cost,screen;
	ExecutiveStall()
	{
		
	}
	public ExecutiveStall(String stallName, String ownerName, int cost, int screen) {
		super();
		this.stallName = stallName;
		this.ownerName = ownerName;
		this.cost = cost;
		this.screen = screen;
	}
	public String getStallName() {
		return stallName;
	}
	public void setStallName(String stallName) {
		this.stallName = stallName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getScreen() {
		return screen;
	}
	public void setScreen(int screen) {
		this.screen = screen;
	}
	public void display()
	{
	
		System.out.println("StallName :"+this.getStallName()+"\n"+"Owner Name :"+this.getOwnerName()+"\n"+"Cost :"+this.getCost()+"\n"+"No of Screen :"+this.getScreen());
	}

}
