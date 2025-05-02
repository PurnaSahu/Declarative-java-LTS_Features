package com.pbs.acc.service;

import java.util.List;

import com.pbs.acc.bean.StoreBean;
import com.pbs.acc.dao.StoreDAOImpl;

public class StoreServiceImpl {
	
	StoreDAOImpl daoImpl = new StoreDAOImpl();
	
	public Integer addStore(List<StoreBean> storeBeans) throws InterruptedException{
		return daoImpl.addStore(storeBeans);
	}
}
