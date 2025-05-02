package com.pbs.acc.bean;

import java.time.LocalDate;

public class Product {
	private int productId;
	private String productName;
	private double price;
	private String category;
	private LocalDate manufacturingDate;
	
	
	public Product(int productId, String productName, double price, String category, LocalDate manufacturingDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.category = category;
		this.manufacturingDate = manufacturingDate;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", category="
				+ category + ", manufacturingDate=" + manufacturingDate + "]";
	}
	
	
}
