package com.hcl.t25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number :");
			int no = s.nextInt();
			System.out.println("Entered number :" + no);
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
	}
}
