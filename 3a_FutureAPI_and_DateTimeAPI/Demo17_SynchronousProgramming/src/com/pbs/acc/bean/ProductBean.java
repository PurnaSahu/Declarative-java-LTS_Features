package com.pbs.acc.bean;

public class ProductBean {
	private Integer productId;
	private String productName;
	
	
	public ProductBean(Integer productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
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
	@Override
	public String toString() {
		return "ProductBean [productId=" + productId + ", productName=" + productName + "]";
	}
	
}
