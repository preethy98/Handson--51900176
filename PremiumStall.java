package com.hcl.t19;

public class PremiumStall implements StallType {
	private String stallName,ownerName;
	private int cost,projector;
	PremiumStall()
	{
		
	}
	public PremiumStall(String stallName, String ownerName, int cost, int projector) {
		super();
		this.stallName = stallName;
		this.ownerName = ownerName;
		this.cost = cost;
		this.projector = projector;
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
	public int getProjector() {
		return projector;
	}
	public void setProjector(int projector) {
		this.projector = projector;
	}
	public void display()
	{
	
		System.out.println("StallName :"+this.getStallName()+"\n"+"Owner Name :"+this.getOwnerName()+"\n"+"Cost :"+this.getCost()+"\n"+"No of Projector :"+this.getProjector());
	}

}
