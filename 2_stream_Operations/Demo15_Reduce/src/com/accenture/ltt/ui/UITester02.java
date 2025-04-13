package com.accenture.ltt.ui;

import com.accenture.ltt.bean.Product;
import com.accenture.ltt.bean.ProductUtility;

public class UITester02 {
	public static void main(String[] args) {
		Product product = ProductUtility.getAllProducts()
			.stream()
			.reduce((product1, product2) -> product1.getPrice() < product2.getPrice() ? product1 : product2)
			.orElse(new Product(0, null, 0, null, null, null));
		System.out.println(product);
	}
}
