package com.accenture.lkm.ui.tester.java10;

import java.util.ArrayList;
import java.util.List;

import com.accenture.lkm.sampleclasses.ProductUtility;

//Note: Make sure JRE compliance is Java10.
public class Tester1004OptionalOrElseThrow {
	public static void main(String[] args) {
		// get the product if product name starts with 'O' else throw NoSuchElementException
		req1();
	}

	//-----------------------------------------------------------------------------------------------------------------------
	// get the product if product name starts with 'O' else throw NoSuchElementException
	//-----------------------------------------------------------------------------------------------------------------------
	private static void req1() {
		ProductUtility.getProductList()
					  .stream()
					  .filter(product -> product.getProductName().startsWith("O"))
					  .findAny()
					  .orElseThrow();
									
	}
}