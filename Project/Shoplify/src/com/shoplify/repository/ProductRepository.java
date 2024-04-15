package com.shoplify.repository;

import com.shoplify.model.Product;

public interface ProductRepository {
	
	Product create(Product product);
	Product delete(Product product);
	Product update(Product product);
	Product findById(int id);
	Product findByName(String name);
	
}
