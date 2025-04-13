package com.accenture.ltt.ui;

import java.util.stream.Stream;

import com.accenture.ltt.bean.Product;
import com.accenture.ltt.bean.ProductUtility;

public class UITester03 {
	public static void main(String[] args) {

		Stream<Product> products = ProductUtility.getAllProducts().stream();
		Product product = products.max((obj1, obj2) -> {
			int result = 0;
			if (obj1.getPrice() > obj2.getPrice()) {
				result = 1;
			} else if (obj1.getPrice() < obj2.getPrice()) {
				result = -1;
			}
			return result;
		}).orElse(new Product(0, null, 0));
		System.out.println(product);

		Stream<Product> products1 = ProductUtility.getAllProducts().stream();
		Product product1 = products1.min((obj1, obj2) -> {
			int result = 0;
			if (obj1.getPrice() > obj2.getPrice()) {
				result = 1;
			} else if (obj1.getPrice() < obj2.getPrice()) {
				result = -1;
			}
			return result;
		}).orElse(new Product(0, null, 0));
		System.out.println(product1);
	}
}
