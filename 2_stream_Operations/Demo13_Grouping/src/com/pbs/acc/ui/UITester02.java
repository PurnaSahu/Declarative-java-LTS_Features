package com.pbs.acc.ui;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.pbs.acc.bean.Product;
import com.pbs.acc.bean.ProductUtility;

public class UITester02 {
	public static void main(String[] args) {
		
		//Req1: Conditional grouping and provide Custom Key
		// the 1st parameter(classifier) of groupingBy() is designed only to provide Key of the Map and the value of the 
		// Map will be bydefault List<dataType> based on each group(means each Key)
		
		Map<String, List<Product>> result = ProductUtility.getAllProducts()
			.stream()
			.collect(Collectors.groupingBy(product -> product.getPrice() >= 30000 ? "high cost":"low cost"));
		
		result.forEach((key, value) -> {
			System.out.println(key);
			value.forEach(System.out::println);
		});
		
		/**
		 * forEach() is NOT limited to Stream in Java. forEach() is actually a method from the Iterable interface.
			Any class that implements Iterable can use forEach(). Streams also have their own forEach(), but that's a separate version.
		 */
	}
}
