package com.pbs.acc.ui;

import java.util.stream.Stream;

public class LengthOfAllStrings {

	public static void main(String[] args) {
		/*
		 * Here we taking each string, find the length of that String from Stream and keep adding the Sum to find 
		 * total length of all Strings combinly.
		 * we will see the demo of 3rd overloaded method of reduce()
		 */
		Stream<String> str = Stream.of("Hiiii...","My name is","Purna","Brahma", "Sahu",", ","Okkk?");
		
		Integer sumOfStrLengths = str.reduce(0, // initial value of totalLength is 0. so it can start like sum= 0+ str.length();
					(sum, eachStr) -> sum + eachStr.length(), // we pass the accumulator, means a BiFunction
					(thread1Data, thread2Data) -> thread1Data+thread2Data); // combiner - merges two partial results, means merges thread results
		System.out.println(sumOfStrLengths);
	}
	
	/*
	 * What is BiFunction?
	 * 	It takes 2 inputs -> 1st input is an Integer, 2nd input is a String and the return type will be Integer
	 */

}
