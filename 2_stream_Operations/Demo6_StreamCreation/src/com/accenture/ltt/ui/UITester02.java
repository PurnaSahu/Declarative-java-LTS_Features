package com.accenture.ltt.ui;

import java.util.stream.Stream;

public class UITester02 {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("Laptop", "Mobile", "TV");
		stream1.forEach(System.out::println);
	}
}
