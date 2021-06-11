package com.qa.javaminiproject.blog.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.qa.javaminiproject.blog.domain.Blog;
import com.qa.javaminiproject.blog.service.BlogService;

@RestController
@RequestMapping("blog")
public class BlogController {

	public BlogService service;

	public BlogController(BlogService service) {
		this.service = service;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Blog>> getAllBlogs(){
		return new ResponseEntity<List<Blog>>(this.service.getAllBlogs(), HttpStatus.OK);
	}
	
	@GetMapping("/byid/{id}")
	public ResponseEntity<Blog> getBlogById(@PathVariable Long id){
		return new ResponseEntity<Blog>(this.service.getBlogById(id), HttpStatus.OK);
	}
	
//	@GetMapping("/byentry")
//	public ResponseEntity<List<Blog>> getBlogByEntry(){
//		
//	}
	
	
}
