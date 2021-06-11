package com.qa.javaminiproject.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.javaminiproject.blog.domain.Blog;
import com.qa.javaminiproject.blog.repo.BlogRepo;

@Service
public class BlogService {
		
	private BlogRepo repo;

	public BlogService(BlogRepo repo) {
		super();
		this.repo = repo;
	}
	
	public List<Blog> getAllBlogs(){
		return this.repo.findAll();
	}
	
	public Blog getBlogById(Long id){
		return this.repo.getById(id);
	}

	public List<Blog> getBlogByEntry(){
		return this.repo.findAll();
	}
}
 