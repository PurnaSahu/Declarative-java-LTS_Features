package com.pbs.acc.ui;

import java.util.stream.Stream;

public class UITester07 {
	public static void main(String[] args) {
		int start = 1;
		int end = 20;
		
		Stream<Integer> stream1 = Stream.iterate(start, n -> n+2).limit(end);
		stream1.forEach(System.out::println);
	}
}
