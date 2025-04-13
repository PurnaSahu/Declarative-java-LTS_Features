package com.accenture.ltt.ui;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class UITester01 {
	public static void main(String[] args) {
		List<String> productNames = Arrays.asList(new String[]{"TV", "Fan", "Mixer", "Washing machine"});
		Stream<String> product = productNames.stream();
		//product.forEach(productName -> System.out.println(productName));
		product.forEach(System.out :: println);
		
		
		Map<Integer, String> products = new HashMap<Integer, String>();
		products.put(1, "TV");
		products.put(20, "Fan");
		products.put(3, "Mouse");
		
		Stream<Entry<Integer, String>> stream1 = products.entrySet().stream();
		stream1.forEach(entry -> System.out.println(entry.getKey()+" - "+entry.getValue()));
	}
}
