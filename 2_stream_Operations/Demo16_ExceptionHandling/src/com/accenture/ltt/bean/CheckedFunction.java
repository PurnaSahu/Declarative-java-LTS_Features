package com.accenture.ltt.bean;

@FunctionalInterface
public interface CheckedFunction<Product, Integer> {
	public Integer addProduct(Product product) throws InvalidProductNameException;
}
