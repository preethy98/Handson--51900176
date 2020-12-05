package com.hcl.t11;

import java.util.Scanner;

public class ProductInformation {

	public static ProductInfo buildProduct() {// creating product object by calling buildProduct method
		ProductInfo p = new ProductInfo();
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

	public static void main(String args[]) {
		ProductInfo[] prod = new ProductInfo[5];
		for (int i = 0; i < prod.length; i++) {
			prod[i] = buildProduct();
		}
		System.out.println("Product Details :");
		System.out.println();
		for (int i = 0; i < 2; i++) {
			System.out.println(prod[i].getName());
			System.out.println("Product Code :" + prod[i].getProduct_code() + "\n" + "Name :"
					+ prod[i].getProduct_name() + "\n" + "Stock :" + prod[i].getStock() + "\n" + "Price :"
					+ prod[i].getPrice() + "\n" + "Discounted Price :" + prod[i].getDiscountedPrice());
			System.out.println();
		}
		System.out.println("The product with minimum stock is :");
		int minimumstock = prod[0].checkLessStock(prod);
		for (int i = 0; i < prod.length; i++) {
			try {
				if ((prod[i].getStock()) == (minimumstock))
					System.out.println(
							"Product Name :" + prod[i].getProduct_name() + "\n" + "Stock :" + prod[i].getStock());
			} catch (NullPointerException e) {
				System.out.println();
			}
		}

	}
}
