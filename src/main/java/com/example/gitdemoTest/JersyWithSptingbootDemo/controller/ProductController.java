package com.example.gitdemoTest.JersyWithSptingbootDemo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
public String getProduct()
	{
		return "product";
	}
	public String getAllProduct()
	{
		return "all products";
	}

}
