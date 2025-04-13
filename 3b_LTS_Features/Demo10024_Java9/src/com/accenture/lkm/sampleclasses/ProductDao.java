package com.accenture.lkm.sampleclasses;

public interface ProductDao {
	private void addProduct(Product product) {
		System.out.println("Product is added: " + product);
	}
	
	private static void displayProduct(Product product) {
		System.out.println(product);
	}
	
	static void testDisplayProduct(Product product) {
		//Uncomment line no 15 and observe the error.
		//Static method can call static methods only
		//addProduct(product);
		displayProduct(product);
	}
	
	default void testProduct(Product product) {
		addProduct(product);
		displayProduct(product);
	}
}