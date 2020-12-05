package com.hcl.features;

public class Sample {
	public static void main(String[] args) {
	Iface i=null;
	i=()->System.out.println("hello Preethy"); // implementing the interface method using Lambda expression
	i.print();
	i=()->System.out.println("Welcome");
	i.print();
	}
}
