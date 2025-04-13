package com.pbs.acc.businessbean;

public class Product {
	
	//this method consumes data(it could be either premitive/non-premitive type data), 
	//do some operation with it if you want but not returns anything
	public void printProductNameUpper(String pname) {
		System.out.println(pname.toUpperCase());
	}

	// this method consumes data, do some condition checking and returns boolean type only
	public boolean productCategory(String category) {
		return (category.equals("electronics")) ? true : false;
	}
	
	// this method not consumes/takes any parameter but only returns data(any type)
	public String returnProductName() {
		return "product name";
	}
	
	//consumes one type of data and returns another type of data
	public Integer returnProductNameLength(String productName) {
		return productName.length();
	}

	//consumes two parameters it could be of different types as well, but not returning anything
	public void printProductDetails(int productId, String productName) {
		System.out.println("Product Details");
		System.out.println("---------------");
		System.out.println("PID: " + productId);
		System.out.println("PName: " + productName+"\n");
	}
}
