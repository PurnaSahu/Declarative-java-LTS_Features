package com.accenture.ltt.ui;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.accenture.ltt.bean.Product;
import com.accenture.ltt.bean.ProductUtility;

public class UITester01 {
	public static void main(String[] args) {
		//Req: group the products based on the product category
		Map<String, List<Product>> result = ProductUtility.getAllProducts()
			.stream()
			.collect(Collectors.groupingBy(product -> product.getCategory()));
		
		result.forEach(
				(key, value) -> {
					System.out.println(key);
					value.forEach(System.out::println);
				}
				);
		
		
		//Req: group the products based on the product category and store the product names in the list
		System.out.println("************************************************");
		Map<String, List<String>> result1 = ProductUtility.getAllProducts()
				.stream()
				.collect(Collectors.groupingBy(product -> product.getCategory(), 
						Collectors.mapping(product -> product.getProductName(), Collectors.toList())));
			
			result1.forEach(
					(key, value) -> {
						System.out.println(key);
						value.forEach(System.out::println);
					}
					);
			
		//req: group the products based on the category and calculate the average product price of each category
		System.out.println("************************************************");
		Map<String, Double> result2 = ProductUtility.getAllProducts()
				.stream()
				.collect(Collectors.groupingBy(product -> product.getCategory(), 
						Collectors.averagingDouble(product -> product.getPrice())));
			
			result2.forEach((key, value) -> System.out.println(key +" - "+value));
		
		
		//req: group the products based on the manufacturing year and find the number of products manufactured in each pf these years
		System.out.println("************************************************");
		Map<Integer, Long> result3 = ProductUtility.getAllProducts()
				.stream()
				.collect(Collectors.groupingBy(product -> product.getManufacturingDate().getYear(), 
						Collectors.counting()));
			
		result3.forEach((key, value) -> System.out.println(key +" - "+value));
		
		
		//req: group the products based on the category and find the product which has max product price
		System.out.println("************************************************");
		Map<String, Optional<Product>> result4 = ProductUtility.getAllProducts()
				.stream()
				.collect(Collectors.groupingBy(product -> product.getCategory(),
						Collectors.maxBy(Comparator.comparing(product -> product.getPrice()))));
			
		result4.forEach((key, value) -> System.out.println(key +" - "+value.get()));
		
		
		//req: group the products based on the category and find the product which has max product price, store them in TreeMap
		System.out.println("************************************************");
		Map<String, Optional<Product>> result5 = ProductUtility.getAllProducts()
				.stream()
				.collect(Collectors.groupingBy(product -> product.getCategory(),
						() -> new TreeMap<>(),
						Collectors.maxBy(Comparator.comparing(product -> product.getPrice()))));
			
		result5.forEach((key, value) -> System.out.println(key +" - "+value.get()));
	}
}
