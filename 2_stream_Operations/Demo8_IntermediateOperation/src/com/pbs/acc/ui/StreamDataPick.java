package com.pbs.acc.ui;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.pbs.acc.bean.Product;
import com.pbs.acc.bean.ProductUtility;

public class StreamDataPick {
	public static void main(String[] args) {
		
		System.out.println("********************************************");
		List<String> productNames = ProductUtility.getAllProducts().stream()
			.filter(product -> product.getPrice() > 50000)	//Stream<Product>
			.peek(product -> System.out.println(product))
			.map(product -> product.getProductName())		//Stream<String>
			.peek(name -> System.out.println(name+"=========="))
			.collect(Collectors.toList());
		
		productNames.forEach(System.out::println);
	}
}
