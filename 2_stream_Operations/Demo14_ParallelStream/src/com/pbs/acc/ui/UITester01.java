package com.pbs.acc.ui;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UITester01 {
	public static void main(String[] args) {
//		Stream<Integer> parallelStream1 = Stream.of(10, 20, 30, 40, 50, 60, 70).parallel();
//		parallelStream1.forEach(System.out::println);
		
		
//		List<String> list = Arrays.asList("a", "b", "c", "d", "e");
//		Stream<String> parallelStream2 = list.parallelStream();
//		parallelStream2.forEach(System.out::println);
		
		
		Stream<String> sequentialStream = Arrays.asList("a", "b", "c", "d", "e").stream();
		long timeBeforeSequentialProcess = System.nanoTime();
		String firstElement1 = sequentialStream.findFirst().orElse("");
		long timeAfterSequentialProcess = System.nanoTime();
		System.out.println("Found '" + firstElement1 + "' in " + (timeAfterSequentialProcess-timeBeforeSequentialProcess) + " nano seconds");
		
		Stream<String> parallelStream = Arrays.asList("a", "b", "c", "d", "e").stream().parallel();
		long timeBeforeSequentialProcess1 = System.nanoTime();
		String firstElement2 = parallelStream.findFirst().orElse("");
		long timeAfterSequentialProcess1 = System.nanoTime();
		System.out.println("Found '" + firstElement2 + "' in " + (timeAfterSequentialProcess1-timeBeforeSequentialProcess1) + " nano seconds");
		
		//we can check how many threads the parallel stream is using, By default, the common pool uses that many threads, but we can configure our own with ForkJoinPool.
		System.out.println("Available processors: " + Runtime.getRuntime().availableProcessors());

	}
}
