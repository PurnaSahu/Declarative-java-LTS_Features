package com.pbs.acc.ui;

import java.util.stream.Stream;

public class UITester05 {
	public static void main(String[] args) {
		Stream<String> empty = Stream.empty();
		System.out.println(empty.count());
		System.out.println(empty.getClass());
	}
}
