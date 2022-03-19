package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Test", description = "REST Apis related to Test Entity!!!!")
@RestController
@RequestMapping(value="/test")
public class Test {

	@ApiOperation(value = "Get specific Test in the System ", response = Test.class, tags = "TestMyController")
	@GetMapping(value="/day")
	String Show() {
		return "Today is Saturday";

	}

}
