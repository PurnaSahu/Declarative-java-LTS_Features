package com.accenture.lkm.ui.tester.java12;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.accenture.lkm.sampleclasses.ProductUtility;

//Make sure JRE compliance pointing to JRE12.
public class Tester1003StringMethods {
    public static void main(String[] args) throws IOException {
    	//indent() - Adjusts the indentation of each line in the string based on the value of ‘n’.
    	testIndent();
    	
    	//Change all product names to uppercase.
    	//transform() - Allows to call a function on the given string. 
    	//testTransform();
    }

    //--------------------------------------------------------------------------------------------------------------
    //indent() - Adjusts the indentation of each line in the string based on the value of ‘n’. 
    //--------------------------------------------------------------------------------------------------------------
	private static void testIndent() {
		String banner = "New product is lanuched today";
		banner = banner.indent(2);
		
		System.out.println(banner);
	}
	
	
	//--------------------------------------------------------------------------------------------------------------
	//Change all product names to uppercase.
    //transform() - Allows to call a function on the given string. 
    //--------------------------------------------------------------------------------------------------------------
	private static void testTransform() {
		List<String> productNames =  
				ProductUtility.getProductList()
							  .stream()
							  .map(product -> product.getProductName().transform(String::toUpperCase))
							  .collect(Collectors.toList());
							 
		productNames.forEach(System.out::println);
	}
}