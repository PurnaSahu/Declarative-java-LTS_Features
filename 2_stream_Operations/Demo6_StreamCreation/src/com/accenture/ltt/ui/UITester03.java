package com.accenture.ltt.ui;

import java.util.stream.Stream;

public class UITester03 {
	public static void main(String[] args) {
		String[] productNames = new String[]{"Laptop", "Camera", "TV", "Phone"};
		Stream<String> stream1 = Stream.of(productNames);
		stream1.forEach(System.out::println);
	}
}
