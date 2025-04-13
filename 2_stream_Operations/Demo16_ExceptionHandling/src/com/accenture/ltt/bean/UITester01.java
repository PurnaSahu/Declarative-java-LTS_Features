package com.accenture.ltt.bean;

import java.util.function.Function;

public class UITester01 {
	public static void main(String[] args) {
		Function<Product, Integer> function = CheckedFunctionUtility.wrap(new ProductDAO()::addProduct);
		Integer result = function.apply(new Product(1001, "Washing Machine", 11110, null, null, null));
		System.out.println(result);
	}
}
