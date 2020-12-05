package com.hcl.t12;

import java.util.Scanner;

public class ProductionDetails {

	public static Product buildProduct() {
		Product p = new Product();// pis the reference variable for Product object
		String namef = "LK Suppliers";// namef is the reference variable for factory name
		Scanner s = new Scanner(System.in);
		System.out.println("Product Code :");
		int product_code = s.nextInt();
		s.nextLine();
		System.out.println("Product Name :");
		String name = s.nextLine();
		System.out.println("Price :");
		double price = s.nextDouble();
		System.out.println("Stock :");
		int Stock = s.nextInt();
		s.nextLine();
		p.setProduct_code(product_code);
		p.setProduct_name(name);
		p.setStock(Stock);
		p.setPrice(price);
		p.setName(namef);
		return p;
	}

	public static void main(String[] args) {
		Product[] prod = new Product[3];
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(
					"Menu" + "\n" + "1. Add Products" + "\n" + "2. Display Products" + "\n" + "3. Get Discounted Price"
							+ "\n" + "4. Find Costly Product" + "\n" + "5. Check Min Stock" + "\n" + "6. Exit");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				for (int i = 0; i < 3; i++) {
					prod[i] = buildProduct();
				}
				break;
			case 2:
				for (int i = 0; i < 3; i++) {
					System.out.println(prod[i].getName() + "\n" + "\n" + "Name :" + prod[i].getProduct_name() + "\n"
							+ "Stock :" + prod[i].getStock() + "\n" + "Price :" + prod[i].getPrice());
					System.out.println();
				}
				break;
			case 3:
				System.out.println("Discounted Price of Products");
				System.out.println("Product Name" + "\t" + " Discounted Price");
				for (int i = 0; i < 3; i++) {
					System.out.println(prod[i].getProduct_name() + "\t" + "\t" + prod[i].getDiscountedPrice());

				}
				break;
			case 4:
				double maxprice = prod[0].checkPrice(prod);
				for (int i = 0; i < prod.length; i++) {
					if ((prod[i].getPrice()) == (maxprice))
						System.out.println(prod[i].getProduct_name() + " is the Costliest Product");
				}
				break;
			case 5:
				System.out.println("The product with minimum stock is :");
				int minimumstock = prod[0].checkLessStock(prod);
				for (int i = 0; i < prod.length; i++) {

					if ((prod[i].getStock()) == (minimumstock))
						System.out.println(
								"Product Name :" + prod[i].getProduct_name() + "\n" + "Stock :" + prod[i].getStock());
				}
				break;
			case 6:
				break;
			}
		} while (ch != 6);
	}
}