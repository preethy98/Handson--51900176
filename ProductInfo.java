package com.hcl.t11;

public class ProductInfo {
	 int product_code, stock;
	 String product_name;
	 double price, discount = 0;
	 String name;
	 ProductInfo[] p;

	public ProductInfo[] getP() {
		return p;
	}

	public void setP(ProductInfo[] p) {
		this.p = p;
	}

	ProductInfo() {

	}

	public   int getProduct_code() {
		return product_code;
	}

	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}

	public  int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public   double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public  String getName() {
		return name;
	}

	public  void setName(String name) {
		this.name = name;
	}

	 String checkPrice(ProductInfo a, ProductInfo b) {
		if (a.getPrice() < b.getPrice())
			return a.getProduct_name() + " is cheaper than " + b.getProduct_name();
		else if (a.getPrice() > b.getPrice())
			return b.getProduct_name() + " is cheaper than " + a.getProduct_name();
		else
			return "Both are having same price";

	}

	double  getDiscountedPrice() {
		if ((getPrice()) >= 80000)
			discount = ((30 * (getPrice()))/100);
		else if ((getPrice()) >= 20000)
			discount = ((20 * (getPrice()))/100);
		else if ((getPrice()) >= 10000)
			discount = ((10 *(getPrice()))/100);
		else
			discount = ((5 *(getPrice()))/100);
		return discount;
	}
	
	 int checkLessStock(ProductInfo[] p)
	{
		int min=0,st=0;
		 st=p[0].getStock();
		for(int i=1;i<p.length;i++)
		{
			try
			{
			if(st<(p[i].getStock()))
				min=st;
			}
			catch(NullPointerException e)
			{
				System.out.println();
			}
		}
		return min;		
	}
}
