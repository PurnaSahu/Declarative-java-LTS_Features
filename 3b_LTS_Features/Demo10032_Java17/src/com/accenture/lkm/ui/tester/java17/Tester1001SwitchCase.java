package com.accenture.lkm.ui.tester.java17;

//Make sure JRE compliance pointing to JRE17.
//Enable preview feature from cmd. 
//Compile: javac --enable-preview --release 17 Tester1001_SwitchCase.java 
//Execute: java --source 17 --enable-preview Tester1001_SwitchCase.java 

public class Tester1001SwitchCase {
	//@SuppressWarnings("preview")
	public static void main(String[] args) {
		String productName = "IPhone"; 
		switch (productName) {
	        case null             -> System.out.println("Oops");
	        case "IPhone", "IPad" -> System.out.println("Great");
	        default               -> System.out.println("Ok");
	    }
		
		
		Object productPrice = 12345.0;
		String formattedPrice = switch (productPrice) {
		    case Integer i -> String.format("int %d", i);
		    case Long l    -> String.format("long %d", l);
		    case Double d  -> String.format("double %f", d);
		    case String s -> String.format("String %s", s);
		    default        -> productPrice.toString();
		};
		System.out.println(formattedPrice);
	}
}
