package com.demo.serviceipl;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.pojo.Product;
import com.demo.pojo.Rating;
import com.demo.productrepository.ProductRepositary;
import com.demo.service.ProductService;

@Component
public class ProductServiceImp implements ProductService {

	@Autowired
	ProductRepositary prodRepos;

	@Override
	public Product addProductDetails(Product product) {

		return prodRepos.save(product);

	}

	public Product productRatingMapping(Product prod, Rating rating) {
          // taking values from enduser that is admin and set into new object becoz for insert new object inot db
		Product newproduct = new Product();
		newproduct.setColor(prod.getColor());
		newproduct.setName(prod.getName());
		newproduct.setOs(prod.getOs());
		newproduct.setSpecification(prod.getSpecification());


		
		Set<Product> settingprod = new HashSet<Product>();
		settingprod.add(prod);
		// from admin
		rating.setRating(rating.getRating());
		rating.setNoOfCustomers(rating.getNoOfCustomers());

		Set<Rating> rate = new HashSet<Rating>();
		rate.add(rating);

		//@ many to many assoctioatn
		
		newproduct.setRatings(rate); // merging product plus rating

		Product p= prodRepos.save(newproduct);
		
		
		return p;

	}

	@Override
	public List<Product> getListOfProducts() {
		List<Product> prodList = prodRepos.findAll();

		return prodList;
	}

	@Override
	public Product updateProductDetailsBtyId(Product prod, Long id) {

		prod.setId(id);
		prod.getName();
		prod.getColor();
		prod.getSpecification();
		prod.getOs();

		Product p = prodRepos.save(prod);

		return p;
	}

	@Override
	public Optional<Product> getDetailsById(Long id) {

		Optional<Product> prodigy = prodRepos.findById(id);
		return prodigy;
	}

	@Override
	public void deleteProductById(Long id) {

		prodRepos.deleteById(id);

	}

	@Override
	public List<Product> getListOfProductsByDate(String date) {
		List<Product> prodList = prodRepos.findByDate(date);
		return prodList;
	}

	@Override
	public List<Product> getListOfProductsByName(String name) {
		List<Product> prodList = prodRepos.findByName(name);
		return prodList;
	}

}
