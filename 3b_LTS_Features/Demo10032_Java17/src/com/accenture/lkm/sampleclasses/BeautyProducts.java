package com.accenture.lkm.sampleclasses;

public sealed class BeautyProducts extends Product permits BeautyProductsForWomen {

	@Override
	public String getProductDescription() {
		return "Its a beauty product";
	}
}