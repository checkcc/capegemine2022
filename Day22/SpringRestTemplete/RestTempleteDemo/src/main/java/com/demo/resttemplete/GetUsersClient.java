package com.demo.resttemplete;

import org.springframework.web.client.RestTemplate;

import com.demo.model.User;
import com.demo.model.UserDetailsResponse;

public class GetUsersClient {
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();//this the replacement of POST MAN or any other client
	
		final String url = "http://localhost:8080/user/getAllUsers";
		UserDetailsResponse userDetailsResponse = restTemplate.getForObject(url, UserDetailsResponse.class);
		System.out.println("User retrieved details : ");
		for (User user : userDetailsResponse.getUsers()) {
			System.out.println(user.getName() + " " + user.getAge() + " " + user.getId());
		}

	}

}
