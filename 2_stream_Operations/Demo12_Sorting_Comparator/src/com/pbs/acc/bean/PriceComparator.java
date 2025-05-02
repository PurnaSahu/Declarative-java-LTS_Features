package com.pbs.acc.bean;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {

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
	
	//custom method to perform Double.compareTo()
	public static int compareDouble(Product d1, Product d2){
		
		return Double.compare(d1.getPrice(), d2.getPrice());
	}

}
