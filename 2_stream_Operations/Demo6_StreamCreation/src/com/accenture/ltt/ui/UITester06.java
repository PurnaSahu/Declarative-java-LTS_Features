package com.accenture.ltt.ui;

import java.util.stream.Stream;

public class UITester06 {
	public static void main(String[] args) {
		Stream.Builder<String> productsBuilder = Stream.<String>builder().add("TV").add("Mobile").add("Washing Machine");
		productsBuilder.accept("IPhone");
		productsBuilder.accept("Headphone");
		Stream<String> stream1 = productsBuilder.build();
		stream1.forEach(System.out::println);
	}
}
