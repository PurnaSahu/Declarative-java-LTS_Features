package com.pbs.acc.businessbean;

public class Product {
	public void printProductNameUpper(String pname) {
		System.out.println(pname.toUpperCase());
	}

	public boolean productCategory(String category) {
		return (category.equals("electronics")) ? true : false;
	}
	
	public String returnProductName() {
		return "product name";
	}
	
	public Integer returnProductNameLength(String productName) {
		return productName.length();
	}

	public void printProductDetails(int productId, String productName) {
		System.out.println("Product Details");
		System.out.println("---------------");
		System.out.println("PID: " + productId);
		System.out.println("PName: " + productName);
	}
}
