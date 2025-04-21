package com.pbs.acc.ui;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.pbs.acc.bean.Product;
import com.pbs.acc.bean.ProductUtility;

public class UITester06 {
	public static void main(String[] args) {
		//Collect the stream elements in a Map having id as key name as value
		//no duplicate keys
		
		Stream<Product> products = ProductUtility.getAllProducts().stream();
		Map<Integer, String> map = products.collect(
				Collectors.toMap(product -> product.getProductId(), 
								product -> product.getProductName(), 
								(oldVal, newVal) -> oldVal+","+newVal,
								()-> new TreeMap()));
		
		map.forEach((key, value)->System.out.println(key+" - "+value));
	}
}
