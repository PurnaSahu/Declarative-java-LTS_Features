package com.accenture.ltt.ui;

import java.util.stream.Stream;

public class UITester10 {
	public static void main(String[] args) {
		int[] productIds = {1, 2, 3, 4, 5};
		System.out.println(Stream.of(productIds).count());
		
		
		Integer[] productIds1 = {1, 2, 3, 4, 5};
		System.out.println(Stream.of(productIds1).count());
	}
}


//Stream<Integer>
//Stream<int []>