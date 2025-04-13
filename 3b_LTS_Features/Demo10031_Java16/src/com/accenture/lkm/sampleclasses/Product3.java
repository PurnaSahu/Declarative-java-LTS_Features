package com.accenture.lkm.sampleclasses;

import java.time.LocalDate;

public record Product3(Integer productId,
        String productName,
        String productCategory,
        Double productPrice,
        LocalDate dateOfManufacture) {
	
		public Product3 {
			productName = productName.toUpperCase();
			if(productPrice <= 0) {
				throw new IllegalArgumentException();
			}
		}
		
		public void printDetails() {
			System.out.println("ProductId= " + productId + "    " + "ProductName= " + productName +
				"     " + "ProductCategory= " + productCategory + "     " + "ProductPrice= " + productPrice +
				"     " + "ManufacturingDate= " + dateOfManufacture);
		}
}