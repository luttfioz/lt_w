package com.lt.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lt.web.domain.Customer;
import com.lt.web.service.CustomerService;

@RestController 
@RequestMapping("v1/api/")
public class CustomerController {


	@Autowired
	private CustomerService service;
	
	@GetMapping("customer")
	public Customer getCustomer(){
	
		return service.getCustomer();
		
	}
	
	@GetMapping("customer2")
	public Customer getCustomer2(){
	
		return service.getCustomer();
		
	}
}
