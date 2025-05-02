package com.pbs.acc.ui;

import java.util.Optional;
import java.util.stream.Stream;

public class UITester01 {
	public static void main(String[] args) {
		Stream<Integer> stream1 = Stream.of(10, 20, 30, 40, 50);
		Optional<Integer> result = stream1.reduce((num1, num2) -> num1 + num2);
		System.out.println(result.orElse(0));
		
		
		Stream<Integer> stream2 = Stream.of(10, 20, 30, 40, 50);
		Integer result1 = stream2.reduce(5, (num1, num2) -> num1 + num2);
		System.out.println(result1);
		
	}
}
