package com.pbs.acc.ui;

import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class UITester08 {
	public static void main(String[] args) {
		//we did the same thing but 3 different way of declarative programming style
		//==================================================================================
		
		Stream<Double> stream1 = Stream.generate(Math::random).limit(5);
		stream1.forEach(System.out::println);
		
		//==================================================================================
		
		System.out.print("How many 6 digit OTP do you want? ");
		Scanner sc = new Scanner(System.in);
		int howManyOtp = sc.nextInt();
		sc.close();
		
		Stream<Integer> stream2 = Stream.generate(new Supplier<Integer>() {
			@Override
			public Integer get() {
				int otp = 100000 + (int) (Math.random()*1000000);
				return otp;
			}
			
		}).limit(howManyOtp);
		System.out.println("we have generated "+howManyOtp+" as below;");
		stream2.forEach(eachOtp-> System.out.println(eachOtp));
		
		//===================================================================================
		
		Stream<Integer> stream3 = Stream.generate(() -> (int) (Math.random()*1000000)).limit(2);
		stream3.forEach(System.out::println);
		
		//==================================================================================
		
		//Stream.generate(generateOtp()); -> it wont work like this, coz the method generateOtp()  will immediately return an integer
										// and it wont work as a supplier, so we have to pass it as a supplier
		Stream.generate(()-> generateOtp()).limit(3);
		
	}
	
		public static int generateOtp() {
			int otp = 100000 + (int) (Math.random()*1000000);
			return otp;
		}
	
/*
 * the genarate() -> takes a supplier, usually when we pass a supplier, its a collection object and and its finite,
 * but in this example we passing an infinite supplier, hence setting limit is manadatory
 */
}
