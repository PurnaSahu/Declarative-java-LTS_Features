package com.accenture.lkm.sampleclasses;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProductUtility {
	public static List<Product> getProductList() {
		List<Product> products = new ArrayList<Product>();
		
		products.add(new Product(12, "HP Laptop", "N", 25000.0, LocalDate.of(2000, 2, 24), 
				Arrays.asList("M1", "M2", "M3")));
		products.add(new Product(2, "TV", "O", 30000.0, LocalDate.of(2021, 1, 1),
				Arrays.asList("M1", "M2")));
		products.add(new Product(3, "Sony Handy Cam", "N", 28000.0, LocalDate.of(2020, 7, 7),
				Arrays.asList("M1", "M2", "M3", "M4")));
		products.add(new Product(4, "Washing Machine", "O", 28000.0, LocalDate.of(2021, 1, 27),
				Arrays.asList("M1", "M2")));
		products.add(new Product(5, "Ipod", "N", 90000.0, LocalDate.of(2000, 12, 12),
				Arrays.asList("M1", "M2", "M3", "M4", "M5")));
		products.add(new Product(6, "IPhone", "N", 90000.0, LocalDate.of(2021, 5, 1),
				Arrays.asList("M1", "M3", "M5")));
		products.add(new Product(7, "Ipad", "N", 25000.0, LocalDate.of(2015, 6, 12),
				Arrays.asList("M1", "M3", "M4")));
		products.add(new Product(5, "A.C.", "O", 30000.0, LocalDate.of(2021, 6, 1),
				Arrays.asList("M1", "M3", "M4")));
		products.add(new Product(9, "Fan", "N", 28000.0, LocalDate.now(),
				Arrays.asList("M2", "M3", "M5")));
		products.add(new Product(10, "Table", "O", 28000.0, LocalDate.now(),
				Arrays.asList("M1", "M2", "M3")));
		
		//products.add(null);products.add(null); products.add(null);
		
		return products;
	}
	
	// get product prices
	public static List<String> getProductNameList() {
		List<Product> products = ProductUtility.getProductList();
		List<String> productNames = new ArrayList<>();
		
		products.forEach(product -> productNames.add(product.getProductName()));
		
		return productNames;
	}
	
	// get product ids
	public static Set<Integer> getProductIdSet() {
		List<Product> products = ProductUtility.getProductList();
		Set<Integer> productIds = new HashSet<>();
			
		products.forEach(product -> productIds.add(product.getProductId()));
		
		return productIds;
	}
	
	// get map of productids and productnames
	public static Map<Integer, String> getProductIdAndNameMap() {
		List<Product> products = ProductUtility.getProductList();
		Map<Integer, String> productIdsAndNames = new HashMap<>();
				
		products.forEach(product -> productIdsAndNames.put(product.getProductId(), product.getProductName()));
			
		return productIdsAndNames;
	}
}
