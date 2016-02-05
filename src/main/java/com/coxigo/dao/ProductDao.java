package com.coxigo.dao;

import java.util.List;
import com.coxigo.domain.Product;

public interface ProductDao {
	
	boolean insertProductDetail(Product objProduct) throws Exception;

	public List<Product> search(String searchCategory)throws Exception;
	public List<Product> searchFulltext(String searchText) throws Exception;
	
	
}
