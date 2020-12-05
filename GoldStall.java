package com.hcl.t19;

public class GoldStall implements StallType {
	private String stallName,ownerName;
private int cost,tvSet;
GoldStall()
{
	
}

	public GoldStall(String stallName, String ownerName, int cost, int tvSet) {
	super();
	this.stallName = stallName;
	this.ownerName = ownerName;
	this.cost = cost;
	this.tvSet = tvSet;
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

	public int getTvSet() {
		return tvSet;
	}

	public void setTvSet(int tvSet) {
		this.tvSet = tvSet;
	}

	public void display()
	{
		System.out.println("StallName :"+this.getStallName()+"\n"+"Owner Name :"+this.getOwnerName()+"\n"+"Cost :"+this.getCost()+"\n"+"TV Set :"+this.getTvSet());
	}

}
