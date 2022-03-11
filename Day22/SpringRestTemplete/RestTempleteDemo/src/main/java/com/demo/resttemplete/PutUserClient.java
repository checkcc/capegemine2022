package com.demo.resttemplete;

import org.springframework.web.client.RestTemplate;

import com.demo.model.User;

public class PutUserClient {
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		final String url = "http://localhost:8080/user/updateUser";
		User user = new User();
		user.setId(1);
		user.setAge(20);
		user.setName("John1");
		restTemplate.put(url, user);

		// Verify updated user details
		final String getUrl = "http://localhost:8080/user/getSpecificUser/1";
		User updatedUser = restTemplate.getForObject(getUrl, User.class);
		System.out.println("User updated details : ");
		System.out.println(updatedUser.getName() + " " + updatedUser.getAge() + " " + updatedUser.getId());

	}
}
