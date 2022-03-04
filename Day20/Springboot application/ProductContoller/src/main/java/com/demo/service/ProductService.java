package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.pojo.Product;

@Service
public interface ProductService {
	// POST
	void addProductDetails(Product prodcut);

	// GET
	List<Product> getListOfProducts();

	/// PUT
	Product updateProductDetailsBtyId(int id);

	// GET
	Product getDetailsById(int id);

	// delete by id
	void deleteProductById(int id);

}
