package com.pbs.acc.ui;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import com.pbs.acc.bean.ProductUtility;

public class DistinctDataFromStream {
	public static void main(String[] args) {
		
		System.out.println("********************************************");
		Set<String> productNames = ProductUtility.getAllProducts().stream()
			.map(product -> product.getCategory())
			.distinct()
			.collect(Collectors.toSet());
		productNames.forEach(System.out::println);
		
		ProductUtility.getPrimitiveData().stream().distinct().forEach(data -> System.out.print(data));
				
		int[] arr = ProductUtility.getPrimitiveData().stream().mapToInt(intData -> intData).distinct().toArray();
		System.out.println(Arrays.toString(arr));
	}
}
