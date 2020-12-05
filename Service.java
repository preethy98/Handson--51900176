package com.hcl.t22;

public class Service implements Car {
	int sum,years;
	double charge=0,discount;
	String brand;
	
	public Service(int sum,int years,String brand) {
		super();
		this.sum = sum;
		this.years=years;
		this.brand=brand;
	}

	public void sum() {
if(sum%2==0)
	System.out.println("You can come on Tuesday, Thursday or Saturday");
else
	System.out.println("You can come on Monday,Wednesday,Friday");
	}

	public void years() {
		
if(years>5)
	System.out.println("You are eligible for free washing");
else 
	System.out.println("You are not eligible for free washing");
	}

	public void brand() {
		if(brand.equals("Maruti")) {
			discount=(5*5000/100);
			charge=5000-discount;
	System.out.println("Your servicing charges are-"+charge);
		}
	else
		System.out.println("Your servicing charges are-5000");

	}
}
