package com.accenture.ltt.ui;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.accenture.ltt.bean.Product;
import com.accenture.ltt.bean.ProductUtility;

public class UITester02 {
	public static void main(String[] args) {
		Map<String, List<Product>> result = ProductUtility.getAllProducts()
			.stream()
			.collect(Collectors.groupingBy(product -> product.getPrice() >= 30000 ? "high cost":"low cost"));
		result.forEach((key, value) -> {
			System.out.println(key);
			value.forEach(System.out::println);
		});
		
	}
}
