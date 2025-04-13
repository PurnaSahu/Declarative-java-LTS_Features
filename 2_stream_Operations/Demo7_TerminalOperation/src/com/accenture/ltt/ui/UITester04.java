package com.accenture.ltt.ui;

import java.util.Comparator;
import java.util.stream.Stream;

import com.accenture.ltt.bean.Product;
import com.accenture.ltt.bean.ProductUtility;

public class UITester04 {
	public static void main(String[] args) {

		Stream<Product> products = ProductUtility.getAllProducts().stream();
		Product product = products
							.max(Comparator.comparing(Product::getPrice))
							.orElse(new Product(0, null, 0));
		System.out.println(product);

		
		Stream<Product> products1 = ProductUtility.getAllProducts().stream();
		Product product1 = products1
				.min(Comparator.comparing(Product::getPrice))
				.orElse(new Product(0, null, 0));
		System.out.println(product1);
	}
}
