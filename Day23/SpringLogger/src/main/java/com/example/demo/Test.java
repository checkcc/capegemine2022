package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// using Use @Slf4j


@RestController
@RequestMapping(value="/test")
public class Test {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());


	@GetMapping(value="/day")
	String Show() {
		
		LOG.info(":INSID THE SHOW METHOD####################################################");
		
		 LOG.debug("debug message");
	        LOG.info("This is an info message");
	        LOG.warn("Warning for this application");
	        LOG.error("Seems error in the application");
		return "Today is Saturday";

	}

}
