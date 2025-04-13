package com.accenture.lkm.ui.tester.java9;

import java.time.LocalDate;
import java.util.Arrays;

import com.accenture.lkm.sampleclasses.Product;
import com.accenture.lkm.sampleclasses.ProductDao;

class ProductDaoImpl implements ProductDao {}

//Make sure JRE compliance is pointing to Java 9. 
public class Tester1002InterfacePrivateMethod {
	public static void main(String[] args) {
		ProductDao productdao = new ProductDaoImpl();
		Product product = new Product(101, "Fan", "N", 1234.56, LocalDate.now(), Arrays.asList("M1", "M2", "M3"));
		productdao.testProduct(product);
		
		//Uncomment below line and observe. Static methods of interface cannot be invoked using reference of interface.
		//productdao.testDisplayProduct(product);
		
		//Static methods of interface can be invoked in static way only, by name of interface.
		ProductDao.testDisplayProduct(product);
	}
}
