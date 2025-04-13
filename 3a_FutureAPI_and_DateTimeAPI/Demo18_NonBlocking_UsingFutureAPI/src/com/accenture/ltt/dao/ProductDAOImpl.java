package com.accenture.ltt.dao;

import java.util.List;

import com.accenture.ltt.bean.ProductBean;

public class ProductDAOImpl {
	public Integer addProduct(List<ProductBean> productList) throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+" Started Product DAO");
		
		int result = 0;
		for(ProductBean bean : productList) {
			Thread.sleep(5000);
			System.out.println("Created Product :"+bean);
			result++;
		}
		
		System.out.println(Thread.currentThread().getName()+" Ended Product DAO");
		return result;
	}
}
