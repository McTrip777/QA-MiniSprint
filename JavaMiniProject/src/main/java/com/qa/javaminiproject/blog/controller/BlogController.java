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
		return ResponseEntity.ok(this.service.getBlogById(id));
	}
	
	@GetMapping("/bytitle/{title}")
	public ResponseEntity<List<Blog>> getBlogByTitle(@PathVariable String title){
		return new ResponseEntity<List<Blog>>(this.service.getBlogByTitle(title), HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Blog> createBlog(@RequestBody Blog b){
		return new ResponseEntity<Blog>(this.service.createBlog(b), HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Blog> updateBlog(@RequestBody Blog b, @PathVariable Long id){
		return new ResponseEntity<Blog>(this.service.updateBlog(id, b), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Blog> deleteBlog(@PathVariable Long id){
		return this.service.deleteBlog(id) ? new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR) :new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
