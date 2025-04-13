package com.accenture.ltt.bean;

public class StoreBean {
	private Integer storeId;
	private String storeName;
	public StoreBean(Integer storeId, String storeName) {
		super();
		this.storeId = storeId;
		this.storeName = storeName;
	}
	public Integer getStoreId() {
		return storeId;
	}
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	@Override
	public String toString() {
		return "StoreBean [storeId=" + storeId + ", storeName=" + storeName + "]";
	}
	
	
}
