package com.pbs.acc.ui;

import java.util.stream.Stream;

public class UITester02 {
	public static void main(String[] args) {
		
		/*
		 *	Here, Stream.of(), takes a varargs parameter — which means we can pass multiple values (like "Laptop", ""), 
		 *	and internally it treats them like an array.
		 *
		 *	So, internally, its like;
		 *		Stream.of("Laptop", "")
					...is equivalent to:
	
				String[] arr = {"Laptop", ""};
				Stream<String> stream = Stream.of(arr);
				
			So the return type is just a single Stream<String>, not an array of streams.
		 */
		
		Stream<String> stream1 = Stream.of("Laptop", "Mobile", "TV",null,null,"Hii...",null,"okkk");
		
		//stream1.forEach(System.out::println);
		stream1.forEach(eachDataOfStream -> {
			if(eachDataOfStream!=null)
				System.out.println("printing Data: "+eachDataOfStream);
			else
				((Runnable) ()-> System.out.println("Oops!! data consisting null values...")).run();
		});
	}
}

/*	If we would have used this, its not pure lambda expression means First order function, coz the below implementation is Anonymous type
 			else
				Runnable runnable = new Runnable() {
					
					@Override
					public void run() {
						counter++;
						System.out.println("Oops!! data consisting NULL values");
						
					}
				};
			runnable.run() -> by providing Runnable it wont work, we have to call the run() to make it happen
 */

/*
 * What is Runnable?
 * 	It has only 1 abstract method called run(), usually we use it to throw error message or print some logs, if required condition
 * 	doesn't work else do.
 * Its a FI, which takes no parameters and returns nothing, usually it takes a separate thread to execute the run().
 */
