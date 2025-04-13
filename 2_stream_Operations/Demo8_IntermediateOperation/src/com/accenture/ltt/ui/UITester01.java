package com.accenture.ltt.ui;

import java.util.List;
import java.util.stream.Collectors;

import com.accenture.ltt.bean.Product;
import com.accenture.ltt.bean.ProductUtility;

public class UITester01 {
	public static void main(String[] args) {
		ProductUtility.getAllProducts()
			.stream()
			.filter(product -> product.getPrice() < 30000)
			.forEach(System.out::println);
		
		
		ProductUtility.getAllProducts()
			.stream()
			.filter(UITester01::checkProductPrice)
			.forEach(System.out::println);
		
		
		System.out.println("_________________________________________");
		ProductUtility.getAllProducts()
			.stream()
			.filter(product -> product.getProductName().startsWith("M") && product.getPrice() < 30000)
			.forEach(System.out::println);
		
		
		System.out.println("_________________________________________");
		ProductUtility.getAllProducts()
			.stream()
			.filter(product -> product.getProductName().startsWith("M"))
			.filter(product -> product.getPrice() < 30000)
			.forEach(System.out::println);
		
		System.out.println("_________________________________________");
		List<Product> matches = ProductUtility.getAllProducts()
			.stream()
			.filter(product -> product.getProductName().startsWith("M"))
			.filter(product -> product.getPrice() < 30000)
			.collect(Collectors.toList());
	}
	
	public static boolean checkProductPrice(Product product) {
		return product.getPrice() < 30000;
	}
}
