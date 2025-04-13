package com.accenture.lkm.ui.tester.java11;

import java.util.Comparator;

// Note: Make sure jre compliance is Java 11. 
public class Tester1002VarInLambda {
	public static void main(String[] args) {
		//When using var in lambda, we must use it on all parameters.
		case1();
		
		//Can not use var on single variable. 
		//case2();
		
		//Mixing of var and other datatypes is not allowed. 
		//case3();
		
		//Parentheses is must when use var.
		//case4();
	}

	//----------------------------------------------------------------------------------
	// When using var in lambda, we must use it on all parameters.
	//----------------------------------------------------------------------------------
	private static void case1() {
		Comparator<Integer> comparator = (var productPrice1, var productPrice2) -> 
			 															productPrice1>productPrice2? productPrice1:productPrice2;
		System.out.println(comparator.compare(2000, 1000));
	}
	
	//----------------------------------------------------------------------------------
	//Can not use var on single variable. 
	//----------------------------------------------------------------------------------
	private static void case2() {
		//Uncomment below 2 lines and observe the error.
		//Comparator<Integer> comparator = (var productPrice1, productPrice2) -> 
		//																productPrice1>productPrice2? productPrice1:productPrice2;
	}
	
	//----------------------------------------------------------------------------------
	//Mixing of var and other datatypes is not allowed. 
	//----------------------------------------------------------------------------------
	private static void case3() {
		//Uncomment below 2 lines and observe the error.
		//Comparator<Integer> comparator = (var productPrice1, Integer productPrice2) -> 
		//												productPrice1>productPrice2? productPrice1:productPrice2;
	}
	
	
	//----------------------------------------------------------------------------------
	//Parentheses is must when use var. 
	//----------------------------------------------------------------------------------
	private static void case4() {
		//Uncomment below line and observe the error.
		//Consumer<String> consumer = var productName -> System.out.println(productName);
	}
}