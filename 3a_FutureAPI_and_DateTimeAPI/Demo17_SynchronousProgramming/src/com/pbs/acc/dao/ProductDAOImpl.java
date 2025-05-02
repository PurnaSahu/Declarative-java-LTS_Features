package com.pbs.acc.dao;

import java.util.List;

import com.pbs.acc.bean.ProductBean;

public class ProductDAOImpl {
	public Integer addProduct(List<ProductBean> productList) throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+" Started Product DAO");
		
		int result = 0;
		for(ProductBean bean : productList) {
			Thread.sleep(5000); //-> it means the current thread which performing this action will go to idle state for 5 sec
			System.out.println("Created Product :"+bean);
			result++;
		}
		
		System.out.println(Thread.currentThread().getName()+" Ended Product DAO");
		return result;
	}
}
