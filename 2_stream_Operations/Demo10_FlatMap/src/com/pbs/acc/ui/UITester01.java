package com.pbs.acc.ui;

import java.util.List;
import java.util.stream.Collectors;

import com.pbs.acc.bean.ProductUtility;

public class UITester01 {
	public static void main(String[] args) {
		
		//many to one
		List<String> result = ProductUtility.getAllProducts()
			.stream()
			.flatMap(product -> product.getManufacturer().stream())
			.collect(Collectors.toList());
		result.forEach(System.out::println);
		
		
		// see the difference, here we are not using flatMap.
		ProductUtility.getListOfLists().stream().forEach(eachList -> System.out.println(eachList));
		
		//here, we using flatMap
		ProductUtility.getListOfLists().stream().flatMap(eachList -> eachList.stream())
												.forEach(eachList -> System.out.println(eachList));
		
		/**
		 * 1 thing to observe here is, eventhough we using stream already and the data is pipelined in stream, still we have to 
		 * again use stream() inside flatMap().
		 * 
		 * flatMap() expects each element to be "flattened" into zero or more elements, and Stream is the natural container 
		 * for that in Java streams. Inside flatMap(), you must convert the element into a Stream 
		 * ( because it's not directly return object/collection).
		 * 
		 * here, ,getListOfLists() - returns List<List<String>> which is taken by Stream()
		 * 		.stream() -> returns Stream<List<String>> which taken by flatMap()
		 * 		.flatMap() -> takes List<String> but returns Stream<String>
		 * 		.forEach() -> takes each String from the Stream and returns nothing
		 */
	}
}
