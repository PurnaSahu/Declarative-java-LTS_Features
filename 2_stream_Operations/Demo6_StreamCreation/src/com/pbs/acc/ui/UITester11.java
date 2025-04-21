package com.pbs.acc.ui;

import java.util.Arrays;
import java.util.stream.IntStream;

public class UITester11 {
	public static void main(String[] args) {
		IntStream productIds = IntStream.of(10, 20, 30);
		System.out.println(productIds.count());
		
		int[] primitiveArr = {1,2,3,5,8};
		// it returns an IntStream and we can do all available functionalities of IntStream
		Arrays.stream(primitiveArr).count();
	}
}
