package com.pbs.acc.ui;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.pbs.acc.bean.Product;
import com.pbs.acc.bean.ProductUtility;

public class TransformationOfStream {
	public static void main(String[] args) {
		
		//*********************************************Problem-01*************************************************
		/**
		 * Convert Data or transfer data from one type to another type and then unwrap those data from Stream to a List type 
		 * data structure
		 */
		
		//******************************Approach-01***********************************
		
		Stream<Product> products = ProductUtility.getAllProducts().stream();
		//we took Stream<product> data -> converted to Stream<Double> type data -> then we unwrapped the Stream -> and got List<Double> data
		List<Double> prices = products.map(product -> product.getPrice())
			.collect(Collectors.toList());
		prices.forEach(System.out::println);
		
		//******************************Approach-02***********************************
		
		/**
		 * To convert Primitive Stream to data usually there are many ways;
		 * 1. here, we took, Stream<Product> -> transformed them to DoubleStream means Primitive Stream, where we perform statisticts on the data
		 * 		but here we don't want to perform any statistic operations, hence we will convert the DoubleSTream-> to LinkedList<Double>
		 */
		LinkedList<Double> collect = ProductUtility.getAllProducts().stream().mapToDouble(product -> product.getPrice()).collect(() -> new LinkedList<Double>(), 
				(list, data) -> list.add(data), (list1, list2) -> list1.addAll(list2));
		
		/**
		 * 2. converting Primitive stream to data(unwrapping the stream)
		 * 		Stream<Product> -> DoubleStream -> Stream<Double> -> Double type data structure (either we can use forEach and print double data else collect())
		 */
		LinkedList<Double> collect2 = ProductUtility.getAllProducts().stream().mapToDouble(product -> product.getPrice()).boxed().collect(Collectors.toCollection(() -> new LinkedList<Double>()));
		
		/**
		 * 3. using toArray() also we can fetch data from primitiveStream to datastructure
		 */
		double[] array = ProductUtility.getAllProducts().stream().mapToDouble(product -> product.getPrice()).toArray();
		System.out.println(Arrays.toString(array));
		
		//*********************************************Problem-02*************************************************
		/**
		 * Filter the data before, Convert or transfer only the data/product which has price>50000 from one type to another type 
		 * and then unwrap those data from Stream to a Set type data structure
		 */
		
		System.out.println("********************************************\n");
		Set<String> productNames = ProductUtility.getAllProducts().stream()
			.filter(product -> product.getPrice() > 50000)	//Stream<Product>
			.map(product -> product.getProductName())		//Stream<String>
			.collect(Collectors.toSet());
		productNames.forEach(System.out::println);
		
	}
}
