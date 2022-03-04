package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Product;
import com.demo.serviceiml.ProductServiceImp;


@RestController
@RequestMapping("/prod")
public class ProductController {

	@Autowired
	ProductServiceImp productServiceImp;

	@GetMapping(value = "/getproductbyid/{id}")
	public Product getProductDetailsById(@PathVariable("id") int productid) {

		Product prodresult = productServiceImp.getDetailsById(productid);

		return prodresult;

	}

}
