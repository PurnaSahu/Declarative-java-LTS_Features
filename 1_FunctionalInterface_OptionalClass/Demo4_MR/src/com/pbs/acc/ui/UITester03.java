package com.pbs.acc.ui;

import java.util.function.BiFunction;
import java.util.function.Supplier;

import com.pbs.acc.businessbean.Product;
/*
 * here, automatically, when we calling the the abstract method, and based on the parameter and FI we have choosed, JRE automatically
 * able to understands which type of constructor we trying to call
 * 
 * not only constructor, even in method overloading cases as well, based on parameters we pass and the return type JRE will understand 
 * which method we trying to access
 * */
public class UITester03 {
	public static void main(String[] args) {
		
		//lambda expression for default constructor, where the supplier don't takes anything but returns an Product Object.
		Supplier<Product> supplier1 = () -> new Product();
		//method reference for default constructor
		Supplier<Product> supplier2 = Product :: new;
		System.out.println(supplier2.get()+"\n");
		
		
		BiFunction<Integer, String, Product> biFunction1 = 
				(id,name) -> new Product(id, name);
		//method reference for parameterized constructor
		BiFunction<Integer, String, Product> biFunction2 = 
				Product :: new;
		System.out.println(biFunction2.apply(1001, "mobile"));
		
	}
}
