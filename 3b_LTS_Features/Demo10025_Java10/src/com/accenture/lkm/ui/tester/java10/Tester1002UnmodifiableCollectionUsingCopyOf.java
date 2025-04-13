package com.accenture.lkm.ui.tester.java10;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.accenture.lkm.sampleclasses.ProductUtility;

// Make sure JRE compliance is pointing to Java 10. 
public class Tester1002UnmodifiableCollectionUsingCopyOf {
	public static void main(String[] args) {
		//Immutable list using copyOf
		req1();
		
		//Immutable set using copyOf
		//req2();
		
		//Immutable map using using copyOf
		//req3();
	}
	
	//---------------------------------------------------------------------------
	// Immutable list using copyOf
	//--------------------------------------------------------------------------
	private static void req1() {
		//Immutable list
		List<String> productNamesList = ProductUtility.getProductNameList();
		List<String> unmodifiableProductNamesList = List.copyOf(productNamesList);
		System.out.println(unmodifiableProductNamesList);
				
		// Uncomment below line and observe. UnSupportedOperationException is thrown.
		//unmodifiableProductNamesList.add("New Product Name");
	}

	//---------------------------------------------------------------------------
	// Immutable set using copyOf
	//--------------------------------------------------------------------------
	private static void req2() {
		//Immutable set
		Set<Integer> productIdsSet = ProductUtility.getProductIdSet();
		Set<Integer> unmodifiableProductIdsSet = Set.copyOf(productIdsSet);
		System.out.println(unmodifiableProductIdsSet);
						
		// Uncomment below line and observe. UnSupportedOperationException is thrown.
		//unmodifiableProductIdsSet.add(100);
	}
	
	//---------------------------------------------------------------------------
	// Immutable map using copyOf
	//--------------------------------------------------------------------------
	private static void req3() {
		//Immutable Map
		Map<Integer, String> productIdsAndNamesMap = ProductUtility.getProductIdAndNameMap();
		Map<Integer, String> unmodifiableProductIdsAndNamesMap = Map.copyOf(productIdsAndNamesMap);
		System.out.println(unmodifiableProductIdsAndNamesMap);
					
		// Uncomment below line and observe. UnSupportedOperationException is thrown.
		//unmodifiableProductIdsAndNamesMap.put(100, "New Product");
	}
}


