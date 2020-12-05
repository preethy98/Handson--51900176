package com.hcl.t15;

public class StallInfo {
	protected String name,detail,ownerName;
	double cost=0;
	StallInfo()
	{
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double computeCost(String stallType, int squareFeet) {
		if(stallType.equals("Platinum"))
		{
			 cost=200*squareFeet;
		}
		else if(stallType.equals("Diamond")) {
			 cost=150*squareFeet;
		}
		else 
			cost=100*squareFeet;
		return cost;
	}
	public double computeCost(String stallType, int squareFeet, int numberOfTV)
	{
		if(stallType.equals("Platinum"))
			 cost=200*squareFeet+numberOfTV*10000;
		else if(stallType.equals("Diamond"))
			 cost=150*squareFeet+numberOfTV*10000;
		else 
			cost=100*squareFeet+numberOfTV*10000;
		
		return cost;
	}
}
