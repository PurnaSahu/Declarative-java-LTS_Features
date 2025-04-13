package com.accenture.ltt.ui;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.accenture.ltt.bean.Product;
import com.accenture.ltt.bean.ProductUtility;

public class UITester02 {
	public static void main(String[] args) {
		Stream<Product> products = ProductUtility.getAllProducts().stream();
		List<Double> prices = products.map(product -> product.getPrice())
			.collect(Collectors.toList());
		prices.forEach(System.out::println);
		
		
		System.out.println("********************************************");
		List<String> productNames = ProductUtility.getAllProducts().stream()
			.filter(product -> product.getPrice() > 50000)	//Stream<Product>
			.map(product -> product.getProductName())		//Stream<String>
			.collect(Collectors.toList());
		productNames.forEach(System.out::println);
	}
}
