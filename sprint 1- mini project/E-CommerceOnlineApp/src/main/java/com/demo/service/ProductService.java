package com.demo.service;


import java.util.List;
import java.util.Optional;

import com.demo.pojo.Product;

public interface ProductService {
	
	    // POST
		Product addProductDetails(Product prodcut);

		// GET
		List<Product> getListOfProducts();
		
		// GET
		List<Product> getListOfProductsByDate(String date);
		
		// GET
		List<Product> getListOfProductsByName(String name);

		/// PUT
		Product updateProductDetailsBtyId( Product prod, Long id);

		// GET
		Optional<Product> getDetailsById(Long id);

		// delete by id
		void deleteProductById(Long id);

}
