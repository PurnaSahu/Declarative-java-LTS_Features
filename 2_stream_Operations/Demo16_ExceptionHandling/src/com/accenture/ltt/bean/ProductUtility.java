package com.accenture.ltt.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductUtility {
	public static List<Product> getAllProducts(){
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "Mobile", 12345,"O", LocalDate.of(2000, 2, 24), Arrays.asList("M1", "M2", "M3")));
		productList.add(new Product(2, "Washing Machine", 12000,"O", LocalDate.of(2021, 1, 1), Arrays.asList("M1", "M2")));
		productList.add(new Product(3, "HeadPhone", 1000,"N", LocalDate.of(2015, 6, 12), Arrays.asList("M1", "M2", "M3", "M4")));
		productList.add(new Product(4, "TV", 56000,"O", LocalDate.of(2015, 6, 12), Arrays.asList("M1", "M2", "M3", "M4", "M5")));
		productList.add(new Product(5, "IPod", 67000,"N", LocalDate.now(), Arrays.asList("M1", "M3", "M5")));
		return productList;
	}
}
