package com.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Product;
import com.demo.pojo.Rating;
import com.demo.serviceipl.ProductServiceImp;

@RestController
@RequestMapping("/prod")
public class ProductController {

	@Autowired
	ProductServiceImp productServiceImp;


	@GetMapping(value = "/getallproducts")
	public List<Product> getListOfProducts() {
		List<Product> list = productServiceImp.getListOfProducts();
		return list;
	}
	
	@GetMapping(value = "/getprodbydate/{date}")
	public List<Product> getListOfProductsByDate(@PathVariable("date") String prodDate){
		List<Product> list = productServiceImp.getListOfProductsByDate(prodDate);
		return list;
	}
	
	@GetMapping(value = "/getprodbyname/{name}")
	public List<Product> getListOfProductsByName(@PathVariable("name") String prodname){
		List<Product> list = productServiceImp.getListOfProductsByName(prodname);
		return list;
	}

	@GetMapping(value = "/getproductbyid/{id}")
	public Optional<Product> getProductDetailsById(@PathVariable("id") Long productid) {

		Optional<Product> prodresult = productServiceImp.getDetailsById(productid);

		return prodresult;
	}

	@PutMapping(value = "/updateproduct/{id}")
	public Product updateProductDetailsBtyId(@RequestBody Product prod, @PathVariable("id") Long prodId) {
		Product product = productServiceImp.updateProductDetailsBtyId(prod, prodId);

		return product;
	}

	@DeleteMapping(value = "/deleteprodbyid/{id}")
	public String deleteProductById(@PathVariable("id") Long prodId) {

		
		try {
			
			Optional<Product> p = getProductDetailsById(prodId);  //if it exist in db thne it return id
			
			if(p!=null) {
			
			productServiceImp.deleteProductById(prodId);
			return "deleted";
			}
			
			

		}catch(Exception e) {
			
		e.printStackTrace();
			
		}
		return "id not found";
		
	}

	@PostMapping(value = "/addproduct")
	public String addProductDetails(@RequestBody Product product) {
		Product p = productServiceImp.addProductDetails(product);

		if (p != null) {
			return "inserted successfully";
		} else {
			return "not inserted";
		}
	}
	
	
	@PostMapping(value = "/addproductAndratinForAdmin")
	public String addproductAndratinInfoForAdmin(@RequestBody Product product,@RequestBody Rating rating) {
		  
	Product p=	productServiceImp.productRatingMapping(product,rating);
		

		if (p != null) {
			return "inserted successfully";
		} else {
			return "not inserted";
		}
	}
	
	
	

}
