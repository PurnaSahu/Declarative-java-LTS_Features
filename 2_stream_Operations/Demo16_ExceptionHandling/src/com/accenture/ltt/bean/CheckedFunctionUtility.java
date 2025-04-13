package com.accenture.ltt.bean;

import java.util.function.Function;

public class CheckedFunctionUtility {
	public static Function<Product, Integer> wrap(CheckedFunction<Product, Integer> fun){
		Function<Product, Integer> function = product -> {
			Integer value = 0;
			try {
				value = fun.addProduct(product);
			}catch(InvalidProductNameException ex) {
				throw new RuntimeException(ex.getMessage());
			}
			return value;
		};
		return function;
	}
}
