package com.hcl.features;
// Anonymous inner class implementation by extending popcorn class
public class Testpopcorn { 

	public static void main(String[] args) {
		Popcorn p=new Popcorn() {//anonymous inner class extending popcorn class
			public void taste() //taste method overridded
			{
				System.out.println("Delicious");
			}
		};
		p.taste();// Delicious prints child method
Popcorn q=new Popcorn();
q.taste();

	}

}
