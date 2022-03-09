package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.pojo.Product;

@Service
public interface ProductService {
	// POST
	Product addProductDetails(Product prodcut);   //done

	// GET
	List<Product> getListOfProducts();   //?

	/// PUT
	Optional<Product>  updateProductDetailsBtyId(long id); //?

	// GET
	Optional<Product> getDetailsById(long id);    //done

	// delete by id
	void deleteProductById(int id);   //?
	
	//get Seach By id or name or data for else

}
