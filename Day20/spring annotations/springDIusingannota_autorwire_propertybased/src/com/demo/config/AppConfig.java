package com.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/* *
 * 
 * @Configuration: Used to indicate that a class declares one or more @Bean methods. 
 * These classes are processed by the Spring container 
 * to generate bean definitions and service requests for those beans at runtime.
 * 
 * 
 */
 
@Configuration
@ComponentScan(basePackages ="com.demo")
public class AppConfig {

}
