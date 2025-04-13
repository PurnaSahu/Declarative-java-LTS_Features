package com.accenture.ltt.ui;

import java.util.stream.LongStream;

public class UITester12 {
	public static void main(String[] args) {
//		LongStream productPriceRange = LongStream.range(10000, 10500);
//		productPriceRange.forEach(System.out::println);
		
		
		LongStream productPriceRange = LongStream.rangeClosed(10000, 10500);
		productPriceRange.forEach(System.out::println);
	}
}
