package com.hcl.features;

public class TestFunction {

	int x=777;//instance variable
	public void greet()
	{
	Iface i=()-> { // lambda exp implementing print method in interface
		
			int x=800;//local variable
			System.out.println("Welcome ");
			System.out.println("instance var is "+this.x +"\n"+"local var  is "+x);
	};
i.print(); 
i.message();//default method is implemented using lamdda exp
Iface.wish();//static method is implemented using lambda exp
	}
	public static void main(String[] args) {
		TestFunction t=new TestFunction();
t.greet();//as greet is non static
//Test.greet(); if greet method is static
	}

}
