package com.accenture.lkm.ui.tester.java16;

//Make sure JRE compliance pointing to JRE16.
public class Tester1004InstanceOf {
	public static void main(String[] args) {
		//Before Java16
		Object productName1 = "IPhone";
		if(productName1 instanceof String) {
			String prdName = (String) productName1; 
			System.out.println(prdName.length());
		}
				
		//From Java16
		Object productName2 = "IPhone";
		if(productName2 instanceof String prdName1) {		
			System.out.println(prdName1.length());
		}
		
		// scope of prdName1 is within the if block.
		//Uncomment below line and observe the error.
		//System.out.println(prdName1);
	
		if(productName2 instanceof String prdName1) {		
			System.out.println(prdName1.length());
		}
	}
}
