package com.accenture.lkm.ui.tester.java16;

import com.accenture.lkm.sampleclasses.Product2;

//Make sure JRE compliance pointing to JRE16.


public class Tester1002Record {
	public static void main(String[] args) {
		Product2 product = new Product2();
		product.printDetails();
		
		System.out.println("----------------------------------------------------------------------------");
		
		Product2 product1 = new Product2(7, "Old laptop");
		product1.printDetails();
	}
}