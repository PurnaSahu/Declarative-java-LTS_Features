package com.accenture.lkm.ui.tester.java10;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.accenture.lkm.sampleclasses.ProductUtility;

//Note: Make sure JRE compliance is Java10.
public class Tester1003UnmodifiableCollectionUsingToUnmodifiableList {
	public static void main(String[] args) {
		//Create unmodifiable list of product names
		//req1();
		
		//Create unmodifiable set of product ids
		//req2();
		
		//Create unmodifiable map of product ids and names
		//req3();
		
		//Observe difference between Collections.toUnmodifiableList and Collectors.toUnmodifiableList()
		req4();
	}
	
	//----------------------------------------------------------------------------------------------------
	//Create unmodifiable list of product names.
	//----------------------------------------------------------------------------------------------------
	private static void req1() {
		Stream<String> productNamesStream = ProductUtility.getProductNameList().stream();
		List<String> productNamesList = productNamesStream.collect(Collectors.toUnmodifiableList());
		System.out.println(productNamesList);
		
		//Uncomment below line and observe. Throws UnSupportedOperationException.
		//productNamesList.add("New IPhone");	
	}
	
	//----------------------------------------------------------------------------------------------------
	//Create unmodifiable set of product ids.
	//----------------------------------------------------------------------------------------------------
	private static void req2() {
		Stream<Integer> productIdsStream = ProductUtility.getProductIdSet().stream();
		Set<Integer> productIdsSet = productIdsStream.collect(Collectors.toUnmodifiableSet());
		System.out.println(productIdsSet);
			
		//Uncomment below line and observe. Throws UnSupportedOperationException.
		productIdsSet.add(100);	
	}
	
	//----------------------------------------------------------------------------------------------------
	//Create unmodifiable map of product ids and names.
	//----------------------------------------------------------------------------------------------------
	private static void req3() {
		Stream<Entry<Integer,String>> productIdsAndNamesStream = ProductUtility.getProductIdAndNameMap().entrySet().stream();
		Map<Object, Object> productIdsAndNameMap = productIdsAndNamesStream.collect(Collectors.toUnmodifiableMap(id->id, name->name));
		System.out.println(productIdsAndNameMap);
				
		//Uncomment below line and observe. Throws UnSupportedOperationException.
		//productIdsAndNameMap.put(0, "dummy");
	}
	
	//----------------------------------------------------------------------------------------------------
	//Observe difference between Collections.toUnmodifiableList and Collectors.toUnmodifiableList()
	//----------------------------------------------------------------------------------------------------
	private static void req4() {
		//Collections.unmodifiableList
		/*List<String> productsNames = ProductUtility.getProductNameList();
		List<String> unmodifiableProductNames = Collections.unmodifiableList(productsNames);
		//Uncomment below line and observe. Throws UnSupportedOperationException.
		//unmodifiableProductNames.add("New IPhone");
		
		//Comment above line -> unmodifiableProductNames.add("New IPhone");
		productsNames.add("New IPhone");
		//Observe the output. New Phone is added in original list but it is added to unmodifiableProductNames also.
		System.out.println(unmodifiableProductNames);*/
		
		
		//Collectors.unmodifiableList
		Stream<String> productNamesStream = ProductUtility.getProductNameList().stream();
		List<String> productNamesList = productNamesStream.collect(Collectors.toUnmodifiableList());
		System.out.println(productNamesList);
		
		//Uncomment below line and observe. Throws UnSupportedOperationException.
		//productNamesList.add("New IPhone");	
	}
}

