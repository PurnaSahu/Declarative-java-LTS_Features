package com.accenture.lkm.ui.tester.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

//Note: Make sure JRE compliance is Java10.
public class Tester1001LocalVariableInference {
	//var can not be used to declare an instance variable. Uncomment line below and observe the error.
	//var productId = 101;		
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// declaration of var
		//case1();
		
		// var must be initialized.
		//case2();
		
		// var is not a keyword. Can be used as variable name.
		//case3();
		
		// var cannot be used in lambda expression as a parameter type.
		//case4();
		
		// var cannot be used for method parameters and return type.
		//case5();
		
		// var cannot be used as a Generic type.
		//case6();
		
		// var cannot be a placeholder for lambda.
		case7();
	}

	//-----------------------------------------------------------------------------------------------------------------------
	// declaration of var having string value. Can be used in loops.
	//-----------------------------------------------------------------------------------------------------------------------
	private static void case1() {
		var productName = "IPhone";
		System.out.println(productName);
		System.out.println(productName instanceof String);
		
		// var can be used in loops.
		for(var productId=1; productId<=5; System.out.println(productId++)); 
	}
	
	
	//-----------------------------------------------------------------------------------------------------------------------
	// var variable must be initialized. var cannot be initialized with null.
	//-----------------------------------------------------------------------------------------------------------------------
	private static void case2() {
		//Uncomment below line and observe the error. 
		//var productPrice;
		
		//Uncomment below line and observe the error. 
		//var productPrice = null;
	}
	
	//-----------------------------------------------------------------------------------------------------------------------
	// var can also be used as a variable name.
	//-----------------------------------------------------------------------------------------------------------------------
	private static void case3() {
		var var = 10;
		System.out.println(var);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------
	// var cannot be used in lambda expression as a parameter type.
	//-----------------------------------------------------------------------------------------------------------------------
	@SuppressWarnings("unused")
	private static void case4() {
		List<Integer> productIds = List.of(10, 20, 30, 40, 50);
		//Uncomment below line and observe the error. 
		//productIds.forEach(var id -> System.out.println(id));
	}
	
	//-----------------------------------------------------------------------------------------------------------------------
	// var cannot be used for method parameters and return type.
	//-----------------------------------------------------------------------------------------------------------------------
	private static void case5() {
		//Uncomment declaration of getDiscount() method and observe the error. 
	}
	
	/*private static var getDiscount(var productPrice) {
		var discount = (productPrice*10)/100;
		
		return discount;
	}*/
	
	
	//-----------------------------------------------------------------------------------------------------------------------
	// var cannot be used as a Generic type.
	//-----------------------------------------------------------------------------------------------------------------------
	private static void case6() {
		//Uncomment below line and observe the error. 
		//List<var> productList = new ArrayList<>();
		
		var<Double> productPrices = new ArrayList<Double>();
		productPrices.add(1000.0);
		productPrices.add(2000.0);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------
	// var cannot be a placeholder for lambda.
	//-----------------------------------------------------------------------------------------------------------------------
	private static void case7() {
		//Uncomment below line and observe the error. 
		//var function = () -> System.out.println("Here is an error!!");
		
		// just for testing
		//BiFunction<Integer, Float, String> fun = (var i, var f) -> i + " " + f;
		//System.out.println(fun.apply(10, 10.4f));
	}
}

