package com.pbs.acc.businessbean;

public class Product {
	
	public Product() {
		System.out.println("default constructor");
	}
	
	public Product(int id, String name) {
		System.out.println("Id is "+id+" Name is "+name);
	}
	
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
	
	
	public static void printNameUpperStatic(String pname) {
		System.out.println(pname.toUpperCase());
	}

	
	public static void displayDetails(int productId, String productName){
		System.out.println("Product Details Static");
		System.out.println("---------------");
		System.out.println("PID: " + productId);
		System.out.println("PName: " + productName);
	}

	@Override
	public String toString() {
		return "Product []";
	}
	
	
}
