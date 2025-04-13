package com.accenture.ltt.ui;

import java.util.stream.Stream;

public class UITester08 {
	public static void main(String[] args) {
		Stream<Double> stream1 = Stream.generate(Math::random).limit(5);
		stream1.forEach(System.out::println);
	}
}
