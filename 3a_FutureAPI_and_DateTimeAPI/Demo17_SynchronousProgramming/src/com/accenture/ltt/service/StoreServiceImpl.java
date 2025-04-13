package com.accenture.ltt.service;

import java.util.List;

import com.accenture.ltt.bean.StoreBean;
import com.accenture.ltt.dao.StoreDAOImpl;

public class StoreServiceImpl {
	
	StoreDAOImpl daoImpl = new StoreDAOImpl();
	
	public Integer addStore(List<StoreBean> storeBeans) throws InterruptedException{
		return daoImpl.addStore(storeBeans);
	}
}
