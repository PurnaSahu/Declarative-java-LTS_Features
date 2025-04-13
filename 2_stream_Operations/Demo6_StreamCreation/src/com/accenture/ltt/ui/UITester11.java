package com.accenture.ltt.ui;

import java.util.stream.IntStream;

public class UITester11 {
	public static void main(String[] args) {
		IntStream productIds = IntStream.of(10, 20, 30);
		System.out.println(productIds.count());
	}
}
