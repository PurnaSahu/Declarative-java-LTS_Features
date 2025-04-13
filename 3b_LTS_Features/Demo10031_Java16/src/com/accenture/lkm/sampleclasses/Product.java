package com.accenture.lkm.sampleclasses;

import java.time.LocalDate;

public record Product(Integer productId,
        String productName,
        String productCategory,
        Double productPrice,
        LocalDate dateOfManufacture) {
	
		public int hashCode() {
			System.out.println("Custom logic for generating hashCode");
			return 101;
		}
		
		public void printDetails() {
			System.out.println("ProductId= " + productId + "    " + "ProductName= " + productName +
				"     " + "ProductCategory= " + productCategory + "     " + "ProductPrice= " + productPrice +
				"     " + "ManufacturingDate= " + dateOfManufacture);
		}
}