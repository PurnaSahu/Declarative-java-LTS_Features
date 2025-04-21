package com.pbs.acc.ui;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class UITester01 {
	public static void main(String[] args) {
		
		//asList() returns an ArrayList and WKT List is the parent Interface of ArrayList, hence we keeping the ArrayList obj reference
		// in List Type Obj reference
		List<String> productNames = Arrays.asList(new String[]{"TV", "Fan", "Mixer", "Washing machine"});
		Stream<String> product = productNames.stream();
		
		//product.forEach(productName -> System.out.println(productName));
		product.forEach(System.out :: print);
		
		
		Map<Integer, String> products = new HashMap<Integer, String>();
		products.put(1, "TV");
		products.put(20, "Fan");
		products.put(3, "Mouse");
		products.put(3, "Mouse"); // duplicate key wont taken
		
		Stream<Entry<Integer, String>> stream1 = products.entrySet().stream();
		//products.values();
		//products.entrySet().stream().forEach(System.out::println);
		
		//1st way
		products.entrySet().stream().forEach(entry -> System.out.println(entry));
		
		//2nd way
		stream1.forEach(entry -> System.out.println(entry.getKey()+" - "+entry.getValue()));
		
		//3rd way, imperative style
		for(Map.Entry<Integer, String> eachEntry : products.entrySet()) {
			System.out.println("Key: "+eachEntry.getKey()+" & Value: "+eachEntry.getValue());
		}
	}
}
