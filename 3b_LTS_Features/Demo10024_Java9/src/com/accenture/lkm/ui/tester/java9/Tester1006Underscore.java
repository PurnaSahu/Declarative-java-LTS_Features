package com.accenture.lkm.ui.tester.java9;

//Make sure JRE compliance is pointing to Java 9.
public class Tester1006Underscore {
	public static void main(String[] args) {
		//Uncomment line no 7 and observe the error. 
		//String _ ="IPhone";
		String productName_ = "IPhone";
	}
}

//As of release 9, '_' is a keyword, and cannot be used as an identifier.