package com.hcl.t9;

public class ProductTest {
	int product_code,Stock;
	String product_name;
	double price;
	ProductTest()
	{
		
	}
	
	public int getProduct_code() {
		return product_code;
	}
	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
String checkPrice(ProductTest a,ProductTest b)//comparing two products price
{
	if(a.getPrice()<b.getPrice())
		
		return a.getProduct_name()+" is cheaper than " +b.getProduct_name();
	else if(a.getPrice()>b.getPrice())
	     return b.getProduct_name()+" is cheaper than "+a.getProduct_name();
	else
	    return "Both are having same price";
}

}
