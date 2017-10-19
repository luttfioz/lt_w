package com.lt.web.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("v1/api/")
public class HomeController {

	@GetMapping("names")
	public List<String> list(){
		
		return new ArrayList<String>(Arrays.asList("ASD","ASDASD"));
	}
	
	@GetMapping("name")
	public String name(){
		
		return "ASDASD";
	}
}
