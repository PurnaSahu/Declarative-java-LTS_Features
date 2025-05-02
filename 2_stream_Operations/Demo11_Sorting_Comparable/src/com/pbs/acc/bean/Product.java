package com.pbs.acc.bean;

import java.time.LocalDate;
import java.util.List;

public class Product implements Comparable<Product> 
{
	private int productId;
	private String productName;
	private Double price;
	private String category;
	private LocalDate manufacturingDate;
	private List<String> manufacturer;
	public Product(int productId, String productName, double price, String category, LocalDate manufacturingDate,
			List<String> manufacturer) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.category = category;
		this.manufacturingDate = manufacturingDate;
		this.manufacturer = manufacturer;
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
	public List<String> getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(List<String> manufacturer) {
		this.manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", category="
				+ category + ", manufacturingDate=" + manufacturingDate + ", manufacturer=" + manufacturer + "]";
	}
	@Override
	public int compareTo(Product obj) {
		return productName.compareTo(obj.productName);
	}
}
