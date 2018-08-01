package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.zuul.filter.ErrorFilter;
import com.zuul.filter.PostFilter;
import com.zuul.filter.PreFilter;
import com.zuul.filter.RouterFilter;

@SpringBootApplication
@EnableZuulProxy
public class SpringzuulserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringzuulserviceApplication.class, args);
	}
	
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	
	@Bean
	public RouterFilter routerFilter() {
		return new RouterFilter();
	}
	
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	
}
