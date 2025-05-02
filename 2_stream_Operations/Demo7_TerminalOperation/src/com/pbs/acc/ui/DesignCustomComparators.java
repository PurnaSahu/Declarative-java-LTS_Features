package com.pbs.acc.ui;

import java.util.stream.Stream;

import com.pbs.acc.bean.Product;
import com.pbs.acc.bean.ProductUtility;

public class DesignCustomComparators {
	public static void main(String[] args) {

		Stream<Product> products = ProductUtility.getAllProducts().stream();
		Product product = products.max((obj1, obj2) -> {
			int result = 0;
			
			if (obj1.getPrice() > obj2.getPrice()) {
				result = 1;
			} else if (obj1.getPrice() < obj2.getPrice()) {
				result = -1;
			}
			return result;
		}).orElse(new Product(0, null, 0));
		System.out.println(product);

		Stream<Product> products1 = ProductUtility.getAllProducts().stream();
		Product product1 = products1.min((obj1, obj2) -> {
			int result = 0;
			if (obj1.getPrice() > obj2.getPrice()) {
				result = 1;
			} else if (obj1.getPrice() < obj2.getPrice()) {
				result = -1;
			}
			return result;
		}).orElse(new Product(0, null, 0));
		System.out.println(product1);
		
		//this approach will work with primitive type data, directly we call compareTo(), but non-primitive case we have to work on obj methods, like above
		Integer max = ProductUtility.getPrimitiveData().stream().max((intObj1, intObj2) -> intObj1.compareTo(intObj2)).get();
		//or
		Integer min = ProductUtility.getPrimitiveData().stream().min((intObj1, intObj2) -> Integer.compare(intObj1, intObj2)).get();
		System.out.println(max+" & "+min);
	}
}
