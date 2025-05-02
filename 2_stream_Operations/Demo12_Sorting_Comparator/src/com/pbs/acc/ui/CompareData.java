package com.pbs.acc.ui;

import java.util.Comparator;

import com.pbs.acc.bean.NameComparator;
import com.pbs.acc.bean.PriceComparator;
import com.pbs.acc.bean.Product;
import com.pbs.acc.bean.ProductUtility;

public class CompareData {
	public static void main(String[] args) {
		
		//***************************************************Approach-01******************************************************
		/**
		 * Instead of passing the Comparator directly like this, we can optimize it;
		 * 
		 * .sorted(new PriceComparator()) -> instead of this we can pass ;
		 * 
		 * Comparator<Product> priceComparator = new PriceComparator();
		 * .sorted(priceComparator)
		 */
		ProductUtility.getAllProducts()
			.stream()
			.sorted(new PriceComparator())
			.forEach(System.out::println);
		
		ProductUtility.getAllProducts()
		.stream()
		.sorted(new NameComparator())
		.forEach(System.out::println);
		
		//***************************************************Approach-02******************************************************
		// Using Anonymous style, doing the same thing
		ProductUtility.getAllProducts()
		.stream()
		.sorted(new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				int result = 0;

				if (o1.getPrice() > o2.getPrice()) {
					result = 1;
				} else if (o1.getPrice() < o2.getPrice()) {
					result = -1;
				}
				return result;
			}
			
		})
		.forEach(System.out::println);
		
		
		//***************************************************Approach-03******************************************************
		//pure lambda approach -> internally we are passing implementation of Comparator only
		ProductUtility.getAllProducts().stream().sorted((obj1, obj2) ->{
			int result = 0;

			if (obj1.getPrice() > obj2.getPrice()) {
				result = 1;
			} else if (obj1.getPrice() < obj2.getPrice()) {
				result = -1;
			}
			return result;
		});
		
		//Name field is String data, we don't need to write custom compare(), java already provided compareTo()
		ProductUtility.getAllProducts().stream().sorted((p1, p2) -> p1.getProductName().compareToIgnoreCase(p2.getProductName()))
												.forEach(data -> System.out.println(data));
		
		System.out.println("====================================");
		
		
		//***************************************************Approach-04******************************************************
		//use default methods provided by Comparator directly
		ProductUtility.getAllProducts()
		.stream()
		.sorted(Comparator.comparing(prod -> prod.getPrice()))
		.forEach(System.out::println);
		
	}
}
