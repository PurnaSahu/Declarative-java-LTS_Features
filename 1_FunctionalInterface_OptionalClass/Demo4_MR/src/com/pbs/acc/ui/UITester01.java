package com.pbs.acc.ui;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.pbs.acc.businessbean.Product;

public class UITester01 {
	public static void main(String[] args) {
		
		//to access non-static methods, objReference :: methodName, automatically it will understands
		// the parameters to be passed
		Consumer<String> consumer = new Product() :: printProductNameUpper;
				//(name) -> new Product().printProductNameUpper(name);		
		consumer.accept("mobile");
		
		Predicate<String> predicate = new Product() :: productCategory;
				//(category) -> new Product().productCategory(category);
		boolean result = predicate.test("electronics");
		System.out.println(result);
		
		Supplier<String> supplier = new Product() :: returnProductName;
				//() -> new Product().returnProductName();
		System.out.println(supplier.get());
		
		
		Function<String, Integer> function = new Product()::returnProductNameLength;
				//(name) -> new Product().returnProductNameLength(name);
		System.out.println(function.apply("mobile"));
		
		// automatically JRE will understands that printProductDetails, here taking 2 parameters
		BiConsumer<Integer, String> biConsumer = new Product() :: printProductDetails;
				//(id, name) -> new Product().printProductDetails(id, name);
		biConsumer.accept(1001, "Mobile");
	}
}
