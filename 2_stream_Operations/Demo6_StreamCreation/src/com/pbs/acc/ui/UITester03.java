package com.pbs.acc.ui;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class UITester03 {
	public static void main(String[] args) {
		String[] productNames = new String[]{"Laptop", "Camera", "TV", "Phone",null,""," ",null,"okk.."};
		String[] data = {"person",null, "Hello",""};
		
		Stream<String> stream1 = Stream.of(data);
		Stream<String> stream2 =Stream.of(productNames);
		
		stream1.forEach(eachData -> System.out.println(eachData));
		
		Long nonNullCount=stream2.filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				if(t!=null)
					return true;
				else
					return false;
			}
			
		}).count();
		System.out.println("total not null strings available in stream is: "+nonNullCount);
	}
}
