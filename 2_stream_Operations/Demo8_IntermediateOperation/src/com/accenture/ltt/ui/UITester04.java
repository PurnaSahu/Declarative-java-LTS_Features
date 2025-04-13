package com.accenture.ltt.ui;

import java.util.Set;
import java.util.stream.Collectors;

import com.accenture.ltt.bean.ProductUtility;

public class UITester04 {
	public static void main(String[] args) {
		
		System.out.println("********************************************");
		Set<String> productNames = ProductUtility.getAllProducts().stream()
			.map(product -> product.getCategory())
			.distinct()
			.collect(Collectors.toSet());
		productNames.forEach(System.out::println);
	}
}
