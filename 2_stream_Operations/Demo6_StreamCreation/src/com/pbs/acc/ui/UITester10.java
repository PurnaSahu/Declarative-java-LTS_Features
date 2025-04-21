package com.pbs.acc.ui;

import java.util.Arrays;
import java.util.stream.Stream;

public class UITester10 {
	public static void main(String[] args) {
		
		/*
		 * Stream.of(productIds).count();
				This treats the entire primitive array int[] as one object.
				int[] is not automatically converted into a stream of its elements.
				So this returns a stream with just one element — the int[] itself.
				
				
			Arrays.stream(productIds).count();
				This understands we're working with a primitive array, so it returns an IntStream over the elements.
		 */
		
		//Stream<int []> -> the enire array will be considered as an Object or as 1 content, from that object again we can fetch data, 
		//but stream will have only 1 content and that is arr[] object
		
		int[] productIds = {1, 2, 3, 4, 5};
		System.out.println(Stream.of(productIds).count());
		Stream.of(productIds).forEach(arr -> System.out.println(arr[2]));
		
		System.out.println(Arrays.stream(productIds).count());
		
		//Stream<Integer> -> each content of the array will be considered as elements of the stream, coz we using wrapper classes
		Integer[] productIds1 = {1, 2, 3, 4, 5};
		System.out.println(Stream.of(productIds1).count());
	}
}


