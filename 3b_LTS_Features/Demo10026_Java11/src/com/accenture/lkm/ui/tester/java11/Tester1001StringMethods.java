package com.accenture.lkm.ui.tester.java11;

import java.util.List;
import java.util.stream.Collectors;

//Note: Make sure jre compliance is Java11. 
public class Tester1001StringMethods {
	public static void main(String[] args) {
		// isBlank() - Returns true if String is empty or it contains only white spaces.
		//testIsBlank();
		
		// lines() - Returns a stream of strings, which is collection of all substrings split by lines.
		//testLines();
		
		// strip()/stripLeading()/stripTrailing() - Removes the white spaces
		testStrip();
		
		// repeat(int) – Repeats the string that many times given as a parameter
		//testRepeat();
	}

	//---------------------------------------------------------------------------------------------------------------
	// isBlank() - Returns true if String is empty or it contains only white spaces.
	//---------------------------------------------------------------------------------------------------------------
	private static void testIsBlank() {
		String productName = "";
		String productName1 = " ";
		System.out.println("Tesing for \"\"");
		System.out.println(productName.isBlank());		// true
		System.out.println(productName.isEmpty());		// true
		
		System.out.println("Tesing for \" \"");
		System.out.println(productName1.isBlank());		// true
		System.out.println(productName1.isEmpty());		// false
	}
	
	//---------------------------------------------------------------------------------------------------------------
	// lines() - Returns a stream of strings, which is collection of all substrings split by lines.
	//---------------------------------------------------------------------------------------------------------------
	private static void testLines() {
		// returns collection of strings separated by \n or \r
		String message = "New\nproduct\nis\nlanuched\rtoday";
		List<String> wordsInMessage = message.lines().collect(Collectors.toList());
		wordsInMessage.forEach(System.out::println);
	}
	
	//---------------------------------------------------------------------------------------------------------------
	// strip() – Removes the white spaces from both beginning and end of string. 
	// stripLeading() – Removes white spaces from the beginning
	// stripTrailing()  - Removes white spaces from end.
	//---------------------------------------------------------------------------------------------------------------
	private static void testStrip() {
		// removes the white spaces from beginning and end
		String message1 = " New IPhone14      is   launched     ".strip();
		System.out.println(message1 + "today");
		
		String message2 = " ";
		System.out.println("This is a message :" + message2.strip() + "for today");
				
		// removes white spaces from beginning
		String message3 = "  New IPhone14      is   launched    ".stripLeading();
		System.out.println(message3 + "today");
				
		// removes white spaces from end
		System.out.println("  New IPhone14      is   launched    ".stripTrailing() + "today");
	}
	
	//---------------------------------------------------------------------------------------------------------------
	// repeat(int) – Repeats the string that many times given as a parameter
	//---------------------------------------------------------------------------------------------------------------
	private static void testRepeat() {
		// repeating Hello 3 times
		String message1 = "New IPhone14 is launched today";
		String banner1 = message1.repeat(3);
		System.out.println(banner1);
				
		// throws IllegalArgumentException as count can not be negative.
		String message2 = "New IPhone20 is already launched";
		String banner2 = message2.repeat(-3);
		System.out.println(banner2);
	}
}


		
		
		
		
		
		
		

