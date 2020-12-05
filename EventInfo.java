package com.hcl.t17;

public class EventInfo {
	protected String name,detail,ownerName;
	EventInfo()
	{
		
	}
	public EventInfo(String name, String detail, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
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
	void projectedRevenue()
	{
		int revenue=0;
	}
}
