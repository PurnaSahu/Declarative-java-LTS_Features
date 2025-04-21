package com.pbs.acc.ui;

import java.util.Arrays;
import java.util.stream.Stream;

public class UITester04 {
	public static void main(String[] args) {
		String[] productNames = new String[]{"Laptop", "Camera", "TV", "Phone"};
		
		/*
		 * array reference can be passed/used to create stream type-> we have 2 approaches
		 * 			Array.stream(arrReference); -> coz, arr.stream(), stream() not available in Array.
		 * 			Stream.of(arrReference);
		 * 
		 * For Other collections-> there are 2 approaches;
		 * 			Stream.of(listReference);
		 * 			listReference.stream();
		 */
		
		Stream<String> stream1 = Arrays.stream(productNames);
		
		stream1.forEach(System.out::println);
	}
}
