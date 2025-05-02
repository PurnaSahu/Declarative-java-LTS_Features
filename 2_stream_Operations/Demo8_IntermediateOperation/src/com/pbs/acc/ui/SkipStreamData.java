package com.pbs.acc.ui;

import com.pbs.acc.bean.ProductUtility;

public class SkipStreamData {
	public static void main(String[] args) {
		
		ProductUtility.getAllProducts().stream()
		//skip 1st 3 elements
		.skip(3)
		.forEach(System.out::println);
		
		ProductUtility.getPrimitiveData().stream().limit(3).forEach(data -> System.out.print(" "+data));
	}
}
