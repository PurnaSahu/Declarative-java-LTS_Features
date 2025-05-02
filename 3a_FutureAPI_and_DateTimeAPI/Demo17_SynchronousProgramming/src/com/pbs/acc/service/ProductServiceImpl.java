package com.pbs.acc.service;

import java.util.List;

import com.pbs.acc.bean.ProductBean;
import com.pbs.acc.dao.ProductDAOImpl;

public class ProductServiceImpl {
	
	ProductDAOImpl daoImpl = new ProductDAOImpl();
	
	public Integer addProduct(List<ProductBean> productBeans) throws InterruptedException{
		return daoImpl.addProduct(productBeans);
	}
}
