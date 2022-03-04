package com.demo.serviceiml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.pojo.Product;
import com.demo.productrepositary.ProductRespositary;
import com.demo.service.ProductService;


@Component
public class ProductServiceImp implements ProductService  {

	@Autowired
	ProductRespositary productRespositary;  //reference of data layer or bussiness logic class
	
	
	@Override
	public void addProductDetails(Product prodcut) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> getListOfProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProductDetailsBtyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
              //logic here
	@Override
	public Product getDetailsById(int id) {
		
		

		Product prod = new Product();
		prod.setId(id);  //id comes from paramter so dont hardcode here
		prod.setProductname("MAC");
		prod.setColor("black");
		prod.setOs("linux");
		productRespositary.save(prod);//inserting into database of H2
		
		return prod;
	}

	@Override
	public void deleteProductById(int id) {
		// TODO Auto-generated method stub

	}

}
