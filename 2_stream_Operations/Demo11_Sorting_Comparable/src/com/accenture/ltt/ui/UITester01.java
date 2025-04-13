package com.accenture.ltt.ui;

import com.accenture.ltt.bean.ProductUtility;

public class UITester01 {
	public static void main(String[] args) {
		ProductUtility.getAllProducts()
			.stream()
			.map(product -> product.getProductName())
			.sorted()
			.forEach(System.out::println);
	}
}
