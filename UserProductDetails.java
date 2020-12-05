package com.hcl.t10;

import java.util.Scanner;

public class UserProductDetails {

	public static void main(String args[]) {
		UserProduct q = null;
		UserProduct r = null;
		q = buildProduct();
		int product_code1 = q.getProduct_code();
		String name1 = q.getProduct_name();
		int stock1 = q.getStock();
		double price1 = q.getPrice();
		double discount1 = q.getDiscountedPrice();
		r = buildProduct();
		int product_code2 = r.getProduct_code();
		String name2 = r.getProduct_name();
		int stock2 = r.getStock();
		double price2 = r.getPrice();
		double discount2 = r.getDiscountedPrice();
		System.out.println("Product Details :");
		System.out.println(r.getName());
		System.out.println("Product Code :" + product_code1 + "\n" + "Name :" + name1 + "\n" + "Stock :" + stock1 + "\n"
				+ "Price :" + price1 + "\n" + "Discounted Price :" + discount1);
		System.out.println();
		System.out.println(r.getName());
		System.out.println("Product Code :" + product_code2 + "\n" + "Name :" + name2 + "\n" + "Stock :" + stock2 + "\n"
				+ "Price :" + price2 + "\n" + "Discounted Price :" + discount2);

		String out = q.checkPrice(q, r);
		System.out.println(out);

	}

	public static UserProduct buildProduct() {// creating product object inside method and returning product object
		UserProduct p = new UserProduct();
		String namef = "LK Suppliers"; // namef is the reference variable of the factory
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

}
