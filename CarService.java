package com.hcl.t22;

import java.util.Scanner;

public class CarService {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your car number :");
		int no = s.nextInt();
		System.out.println("How many years old car do you have-");
		int years = s.nextInt();
		s.nextLine();
		System.out.println("Car Barnd-");
		String brand = s.nextLine();
		int r, sum = 0;
		while (no > 0) {
			sum = sum + no % 10;
			no = no / 10;
		}
		Car c = new Service(sum, years, brand);
		c.sum();
		c.years();
		c.brand();
	}
}
