package com.demo.serviceiml;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.pojo.Product;
import com.demo.productrepositary.ProductRespositary;
import com.demo.service.ProductService;

@Component
public class ProductServiceImp implements ProductService {

	@Autowired
	ProductRespositary productRespositary; // reference of data layer or bussiness logic class

	/**
	 * add logic here
	 */
	@Override
	public Product addProductDetails(Product prodcut) {
         //add mlgoic        save method 
		return productRespositary.save(prodcut);

	}

	@Override
	public List<Product> getListOfProducts() {

		return null;
	}

	public Optional<Product> updateProductDetailsBtyId(long id) {

		return null;
	}

	// logic here

	public Optional<Product> getDetailsById(long id) {
		Optional<Product> detailsOfproduct = productRespositary.findById(id);
		return detailsOfproduct;
	}

	@Override
	public void deleteProductById(int id) {
	

	}

}
