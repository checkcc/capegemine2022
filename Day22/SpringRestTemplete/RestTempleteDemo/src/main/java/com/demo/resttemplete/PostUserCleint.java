package com.demo.resttemplete;

import org.springframework.web.client.RestTemplate;

import com.demo.model.User;



public class PostUserCleint {
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		final String url = "http://localhost:8080/user/create";
		User user = new User();
		user.setId(1);
		user.setAge(45);
		user.setName("John");
		User addedUser = restTemplate.postForObject(url, user, User.class);
		System.out.println("User Inserted is : " + addedUser.getName());
	}
}
