package com.accenture.lkm.sampleclasses;

import java.time.LocalDate;

public record Product2(Integer productId,
        String productName,
        String productCategory,
        Double productPrice,
        LocalDate dateOfManufacture) {
	
		// custom constructor which must invoke constructor given by compiler
		public Product2() {
			this(100, "New Product", "N", 10000.0, LocalDate.now());
		}
		
		// custom constructor which must invoke constructor given by compiler
		public Product2(int productId, String productName) {
			this(productId, productName, "O", 5000.0, LocalDate.of(2015, 6, 6));
		}
		
		public void printDetails() {
			System.out.println("ProductId= " + productId + "    " + "ProductName= " + productName +
				"     " + "ProductCategory= " + productCategory + "     " + "ProductPrice= " + productPrice +
				"     " + "ManufacturingDate= " + dateOfManufacture);
		}
}