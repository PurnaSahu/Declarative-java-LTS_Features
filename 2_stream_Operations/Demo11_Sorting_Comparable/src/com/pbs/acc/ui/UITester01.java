package com.pbs.acc.ui;

import java.util.Collections;

import com.pbs.acc.bean.ProductUtility;

public class UITester01 {
	public static void main(String[] args) {
		
		//By default the sorting operation happens Ascending Order
		ProductUtility.getAllProducts()
			.stream()
			.map(product -> product.getProductName())
			.sorted()
			.forEach(System.out::println);	
		
		ProductUtility.getAllProducts().stream().map(prod -> prod.getPrice()).sorted(Collections.reverseOrder())
																.forEach(price -> System.out.println(price));
		
		//On Primitive Stream sorted() operation allowed but reversing parameter is not allowed
		ProductUtility.getAllProducts().stream().mapToDouble(prod -> prod.getPrice()).sorted().forEach(prod -> System.out.println(prod));
	}
}
