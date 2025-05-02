package com.pbs.acc.ui;

import java.util.Comparator;

import com.pbs.acc.bean.PriceComparator;
import com.pbs.acc.bean.Product;
import com.pbs.acc.bean.ProductUtility;

public class MultiLevelComparision {
	public static void main(String[] args) {
		ProductUtility.getAllProducts()
			.stream()
			.sorted(
					Comparator.comparingDouble(Product :: getPrice)
					.thenComparing(Product :: getProductName).reversed()
					)
			.forEach(System.out::println);
		
		//PriceComparator priceComparator = new PriceComparator();
		//to compare Double, Integer type data, we can use Double.compare()
		// works on primitive & wrapper primitive type data
		ProductUtility.getAllProducts().stream().sorted((p1, p2) -> PriceComparator.compareDouble(p1, p2)).forEach(data -> System.out.println(data));
		//same way we can do this as well, directly
		ProductUtility.getAllProducts().stream().sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice())).forEach(data -> System.out.println(data));

		//works only on Wrapper Type(Double, Integer etc...), but here the price field is of type double not Double
		//ProductUtility.getAllProducts().stream().sorted((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));
	}
}
