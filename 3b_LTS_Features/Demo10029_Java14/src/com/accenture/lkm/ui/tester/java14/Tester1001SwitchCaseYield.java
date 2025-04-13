package com.accenture.lkm.ui.tester.java14;

//Make sure JRE compliance pointing to JRE14.
public class Tester1001SwitchCaseYield {
	public static void main(String[] args) {
		String productName = "mouse";
			
		String productDescription = getProductDescription(productName);
		System.out.println(productDescription);
	}
	
	public static String getProductDescription(String productName) {
		return 
				switch (productName) {
					case "IPhone", "IPad", "IPod" -> "The Apple product";
					case "TV", "Washing machine", "Fan" -> "Not the Apple product";
					default -> {
								if(productName.isEmpty())
									yield "Please insert a valid product name.";
								else
									yield "Looks like you dont have any valid product.";
								}
				};
	}
}
