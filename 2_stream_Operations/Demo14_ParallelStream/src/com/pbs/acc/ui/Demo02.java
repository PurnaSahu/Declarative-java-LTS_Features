package com.pbs.acc.ui;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo02 {

	public static void main(String[] args) {
		
		/*
		 * All situation Parallel operation is not helpful. In below case;
		 * 
		 *  ForkJoinPool management	Managing the splitting, queuing, and combining of results in ForkJoinPool adds cost. Too fast to 
		 *  benefit	Since each operation is trivial, doing it in multiple threads doesn’t provide meaningful time savings.
		 */
		
		List<Integer> list = IntStream.rangeClosed(1, 1000000).boxed().collect(Collectors.toList());

		// Sequential
		long startTime = System.currentTimeMillis();
		long sum1 = list.stream().mapToLong(i -> i).sum();
		long endTime = System.currentTimeMillis();
		System.out.println("Sum found with sequential Operation is: "+sum1+" in "+(endTime-startTime)+" milli seconds");
		
		
		// Parallel
		long startTime1 = System.currentTimeMillis();
		long sum2 = list.parallelStream().mapToLong(i -> i).sum();
		long endTime1 = System.currentTimeMillis();
		System.out.println("Sum found with parallel Operation is: "+sum2+" in "+(endTime1-startTime1)+" milli seconds");
		
	}
	

}
