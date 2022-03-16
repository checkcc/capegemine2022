package com.demo.pojo;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name = "rating")
public class Rating {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	@Column
	private String rating;
	@Column
	private int noOfCustomers;
	
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST,CascadeType.MERGE},mappedBy = "ratings")
	private Collection<Product> prod;

	

	public Collection<Product> getProd() {
		return prod;
	}

	public void setProd(Collection<Product> prod) {
		this.prod = prod;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public int getNoOfCustomers() {
		return noOfCustomers;
	}

	public void setNoOfCustomers(int noOfCustomers) {
		this.noOfCustomers = noOfCustomers;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
	
	

}
