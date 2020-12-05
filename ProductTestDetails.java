package com.hcl.t9;

import java.util.Scanner;

public class ProductTestDetails {

	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	ProductTest p=new ProductTest();//p and q are reference variable for 2 Product Objects 
	ProductTest q=new ProductTest();
	System.out.println("Product Details :1");
	System.out.println("Product Code :");
	int product_code1 =s.nextInt();
	s.nextLine();
	System.out.println("Product Name :");
	String name1=s.nextLine();
	System.out.println("Price :");
	double price1=s.nextDouble();
	System.out.println("Stock :");
	int Stock1=s.nextInt();
	s.nextLine();
	System.out.println("Product Details :2");
	System.out.println("Product Code :2");
	int product_code2 =s.nextInt();
	s.nextLine();
	System.out.println("Product Name :");
	String name2=s.nextLine();
	System.out.println("Price :");
	double price2=s.nextDouble();
	System.out.println("Stock :");
	int Stock2=s.nextInt();
	p.setPrice(price1);
	p.setProduct_name(name1);
	q.setPrice(price2);
	q.setProduct_name(name2);
	String out=p.checkPrice(p,q);
	System.out.println(out);

	}

}
