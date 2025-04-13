package com.pbs.acc.ui;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.pbs.acc.businessbean.Product;

public class UITester01 {
	public static void main(String[] args) {
		
		/*
		 *  Consumer not returning anything, but still the Return type is Consumer<String>
			So even though the lambda body doesn’t return a value, it’s still valid for a Consumer<String> because:

			Consumer<String> expects a method that:
			void accept(String t);

			Your lambda fits the signature because printProductNameUpper(name) returns void, and that’s 
			exactly what the Consumer interface expects.

			Consumer<String> means: a function that takes a String, returns void.
			Your lambda takes a String and calls a void method.
		*/
		Consumer<String> consumer = 
				(name) -> new Product().printProductNameUpper(name);
		consumer.accept("mobile");
		
		/*
		 * It takes a String and test(String T)-> returns a boolean value
		 * */
		Predicate<String> predicate = 
				(category) -> new Product().productCategory(category);
		boolean result = predicate.test("electronics");
		System.out.println(result);
		
		/*
		 * Supplier<> is opposite of Consumer<>, here it takes void, coz, the internal abstract method called get()-> takes
		 * no parameter, but it returns a String in our case 
		 * 
		 * hence, the return type of the method is Supplier<String>
		 * */
		Supplier<String> supplier = () -> new Product().returnProductName();
		System.out.println(supplier.get());
		
		//=====================================================================
		/*
		 * Function takes String by apply() and generates Integer, hence return type kept as Function<String, Integer>
		 * */
		Function<String, Integer> function = 
				(name) -> new Product().returnProductNameLength(name);
		System.out.println(function.apply("mobile"));
		
		//Anonymous way;
		Function<String, Integer> func= new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				Integer in=new Product().returnProductNameLength(t);
				return in;
			}
		};
		System.out.println(func.apply("Purna Brahma Sahu\n"));// -> here we will pass data to that abstract method using the anonymous class reference
		
		//=====================================================================
		
		BiConsumer<Integer, String> biConsumer = 
				(id, name) -> new Product().printProductDetails(id, name);
		biConsumer.accept(1001, "Mobile");
	}
}
