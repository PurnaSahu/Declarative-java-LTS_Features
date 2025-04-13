package com.pbs.acc.ui;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.pbs.acc.businessbean.Product;
//lambda & MR for static method access
public class UITester04 {
	public static void main(String[] args) {
		
		//static methods can be accessed directly by class name
		Consumer<String> consumer1 = (name) -> Product.printNameUpperStatic(name);
		Consumer<String> consumer2 = Product::printNameUpperStatic;
		consumer2.accept("mobile\n");
		
		BiConsumer<Integer, String> biConsumer1 = 
				(id, name) -> Product.displayDetails(id, name);
		BiConsumer<Integer, String> biConsumer2 = 
				Product::displayDetails;	
		biConsumer2.accept(1001, "mobile");
	}
}
