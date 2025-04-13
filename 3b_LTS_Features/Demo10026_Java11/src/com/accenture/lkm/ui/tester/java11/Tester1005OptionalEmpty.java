package com.accenture.lkm.ui.tester.java11;

import java.util.Optional;

//Note: Make sure jre compliance is Java 11. 
public class Tester1005OptionalEmpty {
	public static void main(String[] args) {
		Optional<String> productNameOptional = Optional.of("IPhone");
		Optional<String> productNameEmpty = Optional.empty();
		
		//Java 11 - isEmpty()
		System.out.println("Optional isEmpty Example");
		System.out.println("productNameOptional isEmpty(): " + productNameOptional.isEmpty());			 // false
		System.out.println("productNameEmpty isEmpty():  " + productNameEmpty.isEmpty());	   			 // true
		
		//Java 8 - isPresent() 
		System.out.println("productNameOptional isPresent(): " + productNameOptional.isPresent());		 // true
		System.out.println("productNameEmpty isPresent(): " + productNameEmpty.isPresent());			 // false
	}
}