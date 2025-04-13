package com.accenture.ltt.ui;

import java.util.Arrays;
import java.util.stream.Stream;

public class UITester04 {
	public static void main(String[] args) {
		String[] productNames = new String[]{"Laptop", "Camera", "TV", "Phone"};
		Stream<String> stream1 = Arrays.stream(productNames);
		stream1.forEach(System.out::println);
	}
}
