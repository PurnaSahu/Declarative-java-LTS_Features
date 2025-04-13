package com.accenture.ltt.ui;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.accenture.ltt.bean.Product;
import com.accenture.ltt.bean.ProductUtility;

public class UITester05 {
	public static void main(String[] args) {
		//Collect the stream elements in a Map having id as key name as value
		//no duplicate keys
		
		Stream<Product> products = ProductUtility.getAllProducts().stream();
		Map<Integer, String> map = products.collect(
														Collectors.toMap(product -> product.getProductId(), 
																		product -> product.getProductName()));
		map.forEach((key, value)->System.out.println(key+" - "+value));
	}
}
