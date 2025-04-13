package com.accenture.lkm.sampleclasses;

import java.time.LocalDate;
import java.util.List;

public class Product {
	private Integer productId;
	private String productName;
	private String productCategory;
	private Double productPrice;
	private LocalDate dateOfManufacture;
	private List<String> manufacturers;

	public Product(Integer productId, String productName, String productCategory, Double productPrice,
			LocalDate dateOfManufacture, List<String> manufacturers) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.dateOfManufacture = dateOfManufacture;
		this.manufacturers = manufacturers;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public LocalDate getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(LocalDate dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	
	public List<String> getManufacturers() {
		return manufacturers;
	}

	public void setManufacturers(List<String> manufacturers) {
		this.manufacturers = manufacturers;
	}

	public void printDetails() {
		System.out.println("ProductId= " + productId + "    " + "ProductName= " + productName +
				"     " + "ProductCategory= " + productCategory + "     " + "ProductPrice= " + productPrice +
				"     " + "ManufacturingDate= " + dateOfManufacture + "    " + "Manufacturers= " + manufacturers);
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCategory="
				+ productCategory + ", productPrice=" + productPrice + ", dateOfManufacture=" + dateOfManufacture
				+ ", manufacturers=" + manufacturers + "]";
	}	
}