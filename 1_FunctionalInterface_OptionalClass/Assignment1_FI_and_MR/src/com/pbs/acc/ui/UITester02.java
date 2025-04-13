package com.pbs.acc.ui;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

import com.pbs.acc.businessbean.Product;
import com.pbs.acc.businessbean.TriConsumer;

/*
 * Here, we are going to learn, how to pass the product object as well as parameter to use that inside for each 
 * functionality we saw on UITester01.java, 
 * instead of directly accessing the global product object reference.
 */

public class UITester02 {
	public static void main(String[] args) {
		Product p1 = new Product();
		
		/*
		 * here once we received both the parameters, its not mandatory to pass both the parameters as parameters 
		 * to the implementing method
		 * how we want to use it internally, its upto us...
		 * */
		BiConsumer<Product, String> consumer = 
				(product, name) -> product.printProductNameUpper(name);
		consumer.accept(p1, "mobile");
		
		
		BiPredicate<Product, String> predicate = 
				(product, category) -> product.productCategory(category);
		boolean result = predicate.test(p1, "electronics");
		System.out.println(result);
		
		// takes Product object as an input and returns a string
		Function<Product, String> function = (product) -> product.returnProductName();
		System.out.println(function.apply(p1));
		
		//takes takes Product & 1 String value as an input and generates Integer as output
		BiFunction<Product, String, Integer> function1 = 
				(product, name) -> product.returnProductNameLength(name);
		System.out.println(function1.apply(p1, "mobile"));
		
		//made a custom FI, to handle this
		TriConsumer tri= (prod, id, name) -> {
			prod.printProductDetails(id, name);
		};
		
		
	}
}
