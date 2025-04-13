package com.accenture.lkm.ui.tester.java14;

//Make sure JRE compliance pointing to JRE14.
public class Tester1002NullPointerDescriptiveMessage {
	public static void main(String[] args) {
		String productName = null;
		
		// Observe console for more descriptive exception message.
		System.out.println(productName.length());
	}
}
