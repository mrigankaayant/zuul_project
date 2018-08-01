package com.zuul;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zuul.model.Employee;

@RestController
@SpringBootApplication
public class SpringBootEmployeeServiceApplication {

	@RequestMapping(value="/echoEmployeeName/{name}")
	public String echoEmployeeName(@PathVariable("name") String name) {
		return "hello <strong style=\"color:red;\">" +name + "</strong> responsed on : "+new Date();
	}

	@RequestMapping(value="/getEmployeeDetails/{name}/{email}/{salary}")
	public Employee getEmployeeDetails(@PathVariable("name") String name,@PathVariable("email") String email,@PathVariable("salary") String salary) {
		return new Employee(name,email,salary);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmployeeServiceApplication.class, args);
	}
}
