package com.accenture.ltt.dao;

import java.util.List;

import com.accenture.ltt.bean.StoreBean;

public class StoreDAOImpl {
	public Integer addStore(List<StoreBean> storeList) throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+" Started Store DAO");
		
		int result = 0;
		for(StoreBean bean : storeList) {
			Thread.sleep(5000);
			System.out.println("Created Store :"+bean);
			result++;
		}
		
		System.out.println(Thread.currentThread().getName()+" Ended Store DAO");
		return result;
	}
}
