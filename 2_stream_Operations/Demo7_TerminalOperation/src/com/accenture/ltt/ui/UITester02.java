package com.accenture.ltt.ui;

import java.util.DoubleSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.accenture.ltt.bean.Product;
import com.accenture.ltt.bean.ProductUtility;

public class UITester02 {
	public static void main(String[] args) {
//		Stream<Product> products = ProductUtility.getAllProducts().stream();
//		Set<Product> productsSet = products.collect(Collectors.toSet());
//		List<Product> productsSet = products.collect(Collectors.toList());
//		LinkedList<Product> productsSet = products.collect(Collectors.toCollection(LinkedList :: new));
		
		
//		List<String> productNames = 
//				Stream.of("TV", "IPad", "IPhone", "Headphone").collect(Collectors.toList());
//		String name = productNames.stream().collect(Collectors.joining(","));
//		System.out.println(name);
		
		
//		List<String> productNames = 
//				Stream.of("TV", "IPad", "IPhone", "Headphone").collect(Collectors.toList());
//		long count = productNames.stream().collect(Collectors.counting());
//		System.out.println(count);
		
//		Stream<Product> products = ProductUtility.getAllProducts().stream();
//		Double average = products.collect(Collectors.averagingDouble(product -> product.getPrice()));
//		System.out.println("Average is "+average);
		
//		Stream<Product> products = ProductUtility.getAllProducts().stream();
//		Double average = products.collect(Collectors.averagingDouble(Product::getPrice));
//		System.out.println("Average is "+average);
		
		Stream<Product> products = ProductUtility.getAllProducts().stream();
		DoubleSummaryStatistics doubleSummaryStatistics = products.collect(Collectors.summarizingDouble(product -> product.getPrice()));
		System.out.println(doubleSummaryStatistics);
	}
}
