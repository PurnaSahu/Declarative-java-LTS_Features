	package com.accenture.lkm.ui.tester.java9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Make sure JRE compliance is pointing to Java 9. 
public class Tester1001UnmodifiableCollection {
	public static void main(String[] args) {
		java8way();
		
		//Immutable list
		//req1();
		
		//Immutable set
		//req2();
		
		//Immutable map using of
		//req3();
		
		//Immutable map using ofEntries
		//req4();
		
		List<Integer> values = new ArrayList();
		values.add(10);
		values.add(20);
		List<Integer> newlist = Collections.unmodifiableList(values);
		values.add(30);
		System.out.println(newlist);
	}
	
	private static void java8way() {
		List<Integer> values = new ArrayList<>();
		values.add(10);
		values.add(20);
		List<Integer> newlist = Collections.unmodifiableList(values);
		values.add(30);
		System.out.println(newlist);	// newList is also modified
	}

	//---------------------------------------------------------------------------
	// Immutable list
	//--------------------------------------------------------------------------
	private static void req1() {
		//Immutable list
		List<String> productNames = List.of("Ipod", "IPhone", "A.C.", "Fan", "Table");
		System.out.println(productNames);
				
		// Uncomment below line and observe. UnSupportedOperationException is thrown.
		//productNames.add("Washing machine");
	}

	//---------------------------------------------------------------------------
	// Immutable set
	//--------------------------------------------------------------------------
	private static void req2() {
		//Immutable list
		Set<String> productNames = Set.of("Ipod", "IPhone", "A.C.", "Fan", "Table");
		System.out.println(productNames);
					
		// Uncomment below line and observe. UnSupportedOperationException is thrown.
		//productNames.add("Washing machine");
	}
	
	//---------------------------------------------------------------------------
	// Immutable map
	//--------------------------------------------------------------------------
	private static void req3() {
		//Immutable list
		Map<Integer, String> products = Map.of(1, "Ipod", 2, "IPhone", 3, "A.C.", 4, "Fan", 5, "Table");
		System.out.println(products);
					
		// Uncomment below line and observe. UnSupportedOperationException is thrown.
		//products.put(6, "Washing machine");
	}
	
	//---------------------------------------------------------------------------
	// Immutable map using ofEntries
	//--------------------------------------------------------------------------
	private static void req4() {
		//Immutable list
		Map<Integer, String> products = 
				Map.ofEntries(Map.entry(1, "Ipod"), Map.entry(2, "IPhone"), Map.entry(3, "A.C."), Map.entry(4, "Fan"), Map.entry(5, "Table"));
		System.out.println(products);
						
		// Uncomment below line and observe. UnSupportedOperationException is thrown.
		//products.put(6, "Washing machine");
	}
}


