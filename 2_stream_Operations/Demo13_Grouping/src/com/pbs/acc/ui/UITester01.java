package com.pbs.acc.ui;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.pbs.acc.bean.Product;
import com.pbs.acc.bean.ProductUtility;
/**
 * forEach() is NOT limited to Stream in Java. forEach() is actually a method from the Iterable interface.
	Any class that implements Iterable can use forEach(). Streams also have their own forEach(), but that's a separate version.
	
	For Map the forEach() -> it takes BiConsumer as input
 */
public class UITester01 {
	public static void main(String[] args) {
		
		//Req1: group the products based on the product category (Default scenario of GroupingBy())
		Map<String, List<Product>> result = ProductUtility.getAllProducts()
			.stream()
			.collect(Collectors.groupingBy(product -> product.getCategory()));
		
		result.forEach(
				(key, value) -> {
					System.out.println(key);
					value.forEach(System.out::println);
				});
		
		//Downstream Collector Scenario -> means the value field type will be depends on type of operation we are doing
		Map<String, Long> countOfEachCategory = ProductUtility.getAllProducts().stream().collect(Collectors.groupingBy(prod -> prod.getCategory(), Collectors.counting()));
		System.out.println(countOfEachCategory);
		
		//Req2: group the products based on the product category and store the product names in the list
		//Downstream Collector Scenario(with 2 parameter)
		
		/**
		 * We grouped each product based on category but now the value downstream of map is List<Product> type but we mapped each 
		 * product to its name (Product::getName), Then collected all those names into a List<String> per group
		 * 
		 * Here, productCategory() -> is the key of the Map and rest values we can decide
		 */
		System.out.println("************************************************");
		Map<String, List<String>> result1 = ProductUtility.getAllProducts()
				.stream()
				.collect(Collectors.groupingBy(product -> product.getCategory(), 
						Collectors.mapping(
											product -> product.getProductName()+" and "+product.getPrice(), 
											Collectors.toList())
						));
			
			result1.forEach(
					(key, value) -> {
						System.out.println(key);
						value.forEach(val -> System.out.println(val));
					}
					);
			
		//req3: group the products based on the category and calculate the average product price of each category
		System.out.println("************************************************");
		Map<String, Double> result2 = ProductUtility.getAllProducts()
				.stream()
				.collect(Collectors.groupingBy(product -> product.getCategory(), 
						Collectors.averagingDouble(product -> product.getPrice())));
			
			result2.forEach((key, value) -> System.out.println(key +" - "+value));
		
		
		//req4: group the products based on the manufacturing year and find the number of products manufactured in each of these years
		System.out.println("************************************************");
		Map<Integer, Long> result3 = ProductUtility.getAllProducts()
				.stream()
				.collect(Collectors.groupingBy(product -> product.getManufacturingDate().getYear(), 
						Collectors.counting()));
			
		result3.forEach((key, value) -> System.out.println(key +" - "+value));
		
		
		//req5: group the products based on the category and find the product which has max product price and also find the min from the group
		System.out.println("************************************************");
		Map<String, Optional<Product>> result4 = ProductUtility.getAllProducts()
				.stream()
				.collect(Collectors.groupingBy(product -> product.getCategory(),
						Collectors.maxBy(Comparator.comparing(product -> product.getPrice()))));
		
		/*
		 * Here, getPrice() returns double type data hence we can not do the comparision the below way;
		 * Collectors.maxBy((obj1, obj2) -> obj1.getPrice().compareTo(obj2.getPrice())) -> it would have work when getPrice() returns a Boxed type(Double)
		 * 
		 * in that case try the solution mentioned in the code, 
		 */
		Map<String, Optional<Product>> minPriceProduct = ProductUtility.getAllProducts()
		.stream()
		.collect(Collectors.groupingBy(product -> product.getCategory(),
				Collectors.minBy((obj1, obj2) -> Double.compare(obj1.getPrice(), obj2.getPrice()))));
			
		result4.forEach((key, value) -> System.out.println(key +" - "+value.get()));
		minPriceProduct.forEach((key, value) -> System.out.println(key+" ---> "+value.orElse(new Product(0, null, 0, null, null, null))));
		
		
		//req6: group the products based on the category and find the product which has max product price, store them in TreeMap/ store them in order
		// we are using here, 3rd overloaded method of groupBy()
		System.out.println("************************************************");
		Map<String, Optional<Product>> result5 = ProductUtility.getAllProducts()
				.stream()
				.collect(Collectors.groupingBy(product -> product.getCategory(),
						() -> new TreeMap<>(),
						Collectors.maxBy(Comparator.comparing(product -> product.getPrice()))));
			
		result5.forEach((key, value) -> System.out.println(key +" - "+value.get()));
	}
}
