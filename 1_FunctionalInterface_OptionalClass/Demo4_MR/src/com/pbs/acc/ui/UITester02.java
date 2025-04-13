package com.pbs.acc.ui;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

import com.pbs.acc.businessbean.Product;

public class UITester02 {
	public static void main(String[] args) {
		Product p1 = new Product();
		
		/*
		 * here we already getting the object reference as input, hence we can directly pass the classNmae
		 * 
		 * (obj, args)-> obj.methodNmae(args)
			ClassName:: methodName
		 */
		BiConsumer<Product, String> consumer = Product :: printProductNameUpper;
				//(product, name) -> product.printProductNameUpper(name);
		consumer.accept(p1, "mobile");
		
		
		BiPredicate<Product, String> predicate = Product :: productCategory;
				//(product, category) -> product.productCategory(category);
		boolean result = predicate.test(p1, "electronics");
		System.out.println(result);
		
		
		Function<Product, String> function = Product :: returnProductName;
				//(product) -> product.returnProductName();
		System.out.println(function.apply(p1));
		
		
		BiFunction<Product, String, Integer> function1 = Product :: returnProductNameLength;
				//(product, name) -> product.returnProductNameLength(name);
		System.out.println(function1.apply(p1, "mobile"));
		
	}
}