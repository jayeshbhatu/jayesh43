package com.coxigo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxigo.dao.ProductDao;
import com.coxigo.domain.Product;
@Service("loginservice")
public class ProductServiceImpl  implements ProductService{
	@Autowired
	ProductDao productDao;
	@Override
	public boolean insertProductDetail(Product objProduct) throws Exception {
		return productDao.insertProductDetail(objProduct);
	}
	@Override
	public List<Product> search(String searchCategory) throws Exception {
		return productDao.search(searchCategory);
	}
	@Override
	public List<Product> searchFullText(String searchText) throws Exception {
		return productDao.searchFulltext(searchText);
	}
	
}
