package com.qa.javaminiproject.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.javaminiproject.blog.service.BlogService;

@RestController
@RequestMapping("blog")
public class BlogController {

	private BlogService service;

	public BlogController(BlogService service) {
		this.service = service;
	}
	
	
	
	
}
