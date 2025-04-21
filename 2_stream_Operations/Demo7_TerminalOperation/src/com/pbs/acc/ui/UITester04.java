package com.pbs.acc.ui;

import java.util.Comparator;
import java.util.stream.Stream;

import com.pbs.acc.bean.Product;
import com.pbs.acc.bean.ProductUtility;

public class UITester04 {
	public static void main(String[] args) {

		Stream<Product> products = ProductUtility.getAllProducts().stream();
		Product product = products
							.max(Comparator.comparing(prod-> prod.getPrice()))
							.orElse(new Product(0, null, 0));
		System.out.println(product);
		
		Stream<Product> products1 = ProductUtility.getAllProducts().stream();
		Product product1 = products1
				.min(Comparator.comparing(Product::getPrice))
				.orElse(new Product(0, null, 0));
		System.out.println(product1);
	}
}
