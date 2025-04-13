package com.accenture.ltt.ui;

import java.util.List;
import java.util.stream.Collectors;

import com.accenture.ltt.bean.ProductUtility;

public class UITester01 {
	public static void main(String[] args) {
		
		//many to one
		List<String> result = ProductUtility.getAllProducts()
			.stream()
			.flatMap(product -> product.getManufacturer().stream())
			.collect(Collectors.toList());
		result.forEach(System.out::println);
		
	}
}
