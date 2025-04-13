package com.accenture.ltt.bean;

public class ProductDAO {

	public Integer addProduct(Product product) throws InvalidProductNameException{
		if(product.getProductName().contains(" ")) {
			throw new InvalidProductNameException();
		}
		return 1;
	}
}
