package com.accenture.lkm.ui.tester.java16;

import java.time.LocalDate;
import java.util.List;

import com.accenture.lkm.sampleclasses.Product;
import com.accenture.lkm.sampleclasses.ProductUtility;

//Make sure JRE compliance pointing to JRE16.


public class Tester1001Record {
	public static void main(String[] args) {
		List<Product> productList = ProductUtility.getProductList();
		productList.forEach(product -> product.printDetails());
		
		System.out.println("--------------------------------------");
		
		Product product = new Product(101, "Mobile", "N", 20000.0, LocalDate.now());
		System.out.println("Id: " + product.productId());
		System.out.println("Name:" + product.productName());
		System.out.println("Category: " + product.productCategory());
		System.out.println("Price: " + product.productPrice());
		System.out.println("Manufacturing date: " + product.dateOfManufacture());
		
		System.out.println("Hashcode: " + product.hashCode());
	}
}
