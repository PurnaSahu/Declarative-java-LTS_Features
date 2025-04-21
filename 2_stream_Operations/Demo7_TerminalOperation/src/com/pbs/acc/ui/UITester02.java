package com.pbs.acc.ui;

import java.util.DoubleSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.pbs.acc.bean.Product;
import com.pbs.acc.bean.ProductUtility;

public class UITester02 {
	public static void main(String[] args) {
		Stream<Product> products = ProductUtility.getAllProducts().stream();
		Set<Product> productsSet = products.collect(Collectors.toSet());
		System.out.println(productsSet);
		//List<Product> productsSet0 = products.collect(Collectors.toList());
		//LinkedList<Product> productsSet1 = products.collect(Collectors.toCollection(LinkedList :: new));
		// it always returns a ArrayList, but we want LinkedList, then we can define that as well in lambda expression
		//LinkedList<Product> productsSet1 = products.collect(Collectors.toCollection(() -> new LinkedList<Product>()));
		
		List<String> productNames = 
				Stream.of("TV", "IPad", "IPhone", "Headphone").collect(Collectors.toList());
		String name = productNames.stream().collect(Collectors.joining(","));
		System.out.println(name);
		
		
		List<String> productNamess = 
				Stream.of("TV", "IPad", "IPhone", "Headphone").collect(Collectors.toList());
		long count = productNamess.stream().collect(Collectors.counting());
		System.out.println(count);
		//ProductUtility.getAllProducts().stream().collect(Collectors.toMap(key-> key));
		
//		Stream<Product> products = ProductUtility.getAllProducts().stream();
//		Double average = products.collect(Collectors.averagingDouble(product -> product.getPrice()));
//		System.out.println("Average is "+average);
		
//		Stream<Product> products = ProductUtility.getAllProducts().stream();
//		Double average = products.collect(Collectors.averagingDouble(Product::getPrice));
//		System.out.println("Average is "+average);
		
//		Stream<Product> products = ProductUtility.getAllProducts().stream();
//		DoubleSummaryStatistics doubleSummaryStatistics = products.collect(Collectors.summarizingDouble(product -> product.getPrice()));
//		System.out.println(doubleSummaryStatistics);
	}
}
