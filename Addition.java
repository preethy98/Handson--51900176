package com.hcl.features;

public class Addition {

	public static void main(String[] args) {
	Iface1 i=null;
	i=(a,b)-> a+b;
     System.out.println("The sum of a and  b is "+i.fun(10,10));
     i=(a,b)->a*b;
     System.out.println("The mulitiplication of a and b is "+i.fun(20, 20));
     i=(a,b)->a-b;
     System.out.println("The subtraction of a and b is "+i.fun(30, 20));
	}

}
