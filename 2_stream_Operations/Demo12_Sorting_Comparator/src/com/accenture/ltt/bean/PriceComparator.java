package com.accenture.ltt.bean;

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

}
