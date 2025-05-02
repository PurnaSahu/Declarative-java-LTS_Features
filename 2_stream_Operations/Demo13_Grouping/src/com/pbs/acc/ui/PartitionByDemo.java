package com.pbs.acc.ui;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.pbs.acc.bean.Product;
import com.pbs.acc.bean.ProductUtility;

public class PartitionByDemo {
	public static void main(String[] args) {
		Map<Boolean, List<Product>> result = ProductUtility.getAllProducts()
			.stream()
			.collect(Collectors.partitioningBy(product -> product.getPrice() >= 30000));
		
		result.forEach((key, value) -> {
			System.out.println(key);
			value.forEach(System.out::println);
		}
		);
	}
}
