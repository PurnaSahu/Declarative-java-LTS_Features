package com.accenture.ltt.ui;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.accenture.ltt.bean.Product;
import com.accenture.ltt.bean.ProductUtility;

public class UITester03 {
	public static void main(String[] args) {
		
		System.out.println("********************************************");
		List<String> productNames = ProductUtility.getAllProducts().stream()
			.filter(product -> product.getPrice() > 50000)	//Stream<Product>
			.peek(product -> System.out.println(product))
			.map(product -> product.getProductName())		//Stream<String>
			.peek(name -> System.out.println(name))
			.collect(Collectors.toList());
		productNames.forEach(System.out::println);
	}
}
