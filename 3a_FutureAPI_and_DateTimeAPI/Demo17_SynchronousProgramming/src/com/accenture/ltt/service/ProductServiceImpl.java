package com.accenture.ltt.service;

import java.util.List;

import com.accenture.ltt.bean.ProductBean;
import com.accenture.ltt.dao.ProductDAOImpl;

public class ProductServiceImpl {
	
	ProductDAOImpl daoImpl = new ProductDAOImpl();
	
	public Integer addProduct(List<ProductBean> productBeans) throws InterruptedException{
		return daoImpl.addProduct(productBeans);
	}
}
