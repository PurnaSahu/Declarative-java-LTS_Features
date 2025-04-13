package com.pbs.acc.ui;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

import com.pbs.acc.businessbean.Product;

public class UITester03 {
	public static void main(String[] args) {
		Product p1 = new Product();
		
		Product p2 = new Product();
				
		BiConsumer<Product, String> consumer = 
				(product, name) -> product.printProductNameUpper(name);
		consumer.accept(p1, "mobile");
		
		
		BiPredicate<Product, String> predicate = 
				(product, category) -> product.productCategory(category);
		boolean result = predicate.test(p1, "electronics");
		System.out.println(result);
		
		
		Function<Product, String> function = (product) -> product.returnProductName();
		System.out.println(function.apply(p1));
		
		
		BiFunction<Product, String, Integer> function1 = 
				(product, name) -> product.returnProductNameLength(name);
		System.out.println(function1.apply(p1, "mobile"));
		
		
		BiConsumer<Integer, String> biConsumer = 
				(id, name) -> new Product().printProductDetails(id, name);
		biConsumer.accept(1001, "Mobile");
	}
}
