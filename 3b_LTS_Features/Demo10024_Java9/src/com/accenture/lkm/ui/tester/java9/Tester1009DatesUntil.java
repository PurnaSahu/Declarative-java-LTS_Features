package com.accenture.lkm.ui.tester.java9;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

import com.accenture.lkm.sampleclasses.Product;

//Make sure JRE compliance is pointing to Java 9.
public class Tester1009DatesUntil {
	//Check if product is manufactured in 1st week of Jan 2021.
    public static void main(String[] args) {
    	Product product = new Product(101, "IPhone", "N", 60000.0, LocalDate.of(2021, 1, 4), List.of("M1"));
    	//Product product = new Product(101, "IPhone", "N", 60000.0, LocalDate.of(2021, 1, 31), List.of("M1"));										   
    	
    	LocalDate startDate = LocalDate.of(2021, 1, 1);
    	LocalDate endDate = startDate.plusDays(7);	// This computes to 8th Jan 2021
    	
    	//datesUntil() - gives a stream of dates where startDate is inclusive and endDate is exclusive. 
    	Stream<LocalDate> datesInJan = startDate.datesUntil(endDate);
    	
    	boolean found = datesInJan.anyMatch(date -> product.getDateOfManufacture().equals(date));
    	if(found) {
    		System.out.println("Product is manufactured in 1st week of Jan 2021");
    	}
    	else {
    		System.out.println("Product is not manufactured in 1st week of Jan 2021");
    	}
    }
}

/* Note: Run the code first by commenting line no 13 and uncommenting line no 12. 
 * and then run the code by commenting line no 11 and uncommenting line no 13. 
 * 
 */
