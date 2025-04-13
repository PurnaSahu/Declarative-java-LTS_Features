package com.accenture.ltt.ui;

import java.util.Comparator;

import com.accenture.ltt.bean.Product;
import com.accenture.ltt.bean.ProductUtility;

public class UITester02 {
	public static void main(String[] args) {
		ProductUtility.getAllProducts()
			.stream()
			.sorted(
					Comparator.comparingDouble(Product :: getPrice)
					.thenComparing(Product :: getProductName).reversed()
					)
			.forEach(System.out::println);
	}
}
