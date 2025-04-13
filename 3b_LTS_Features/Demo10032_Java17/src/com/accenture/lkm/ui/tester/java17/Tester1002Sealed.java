package com.accenture.lkm.ui.tester.java17;

import com.accenture.lkm.sampleclasses.BabyProducts;
import com.accenture.lkm.sampleclasses.BeautyProducts;
import com.accenture.lkm.sampleclasses.ElectronicsProducts;
import com.accenture.lkm.sampleclasses.KidsProducts;
import com.accenture.lkm.sampleclasses.Product;

//Make sure JRE compliance pointing to JRE17.

public class Tester1002Sealed {
	public static void main(String[] args) {
		Product product;
		product = new BabyProducts();
		//product = new ElectronicsProducts();
		//product = new KidsProducts();
		//product = new BeautyProducts();
		
		String productPescription = getDescription(product);
		System.out.println("Product description: " + productPescription);
	}

	private static String getDescription(Product product) {
		String description = null;
		if(product instanceof BabyProducts babyProduct) {
			description = babyProduct.getProductDescription();
		}
		else if(product instanceof BeautyProducts beautyProduct) {
			description = beautyProduct.getProductDescription();
		}
		else if(product instanceof ElectronicsProducts electronicsProduct) {
			description =  electronicsProduct.getProductDescription();
		}
		else if(product instanceof KidsProducts kidsProduct) {
			description = kidsProduct.getProductDescription();
		}
		else {
			description = "Invalid product";
		}
		
		return description;
	}
}