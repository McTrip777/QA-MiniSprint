package com.qa.javaminiproject.blog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.javaminiproject.blog.domain.Blog;
import com.qa.javaminiproject.blog.repo.BlogRepo;

@Service
public class BlogService {
		
	private BlogRepo repo;

	public BlogService(BlogRepo repo) {
		this.repo = repo;
	}
	
// READ ----------------------------
	public List<Blog> getAllBlogs(){
		return this.repo.findAll();
	}
	
	public Blog getBlogById(Long id){
		Optional<Blog> b = this.repo.findById(id);
		return b.orElseThrow();
	}

	public List<Blog> getBlogByTitle(String title){
		return this.repo.findAllByType(title);
	}
// ---------------------------------
// CREATE ----------------------------
	public Blog createBlog(Blog b) {
		return this.repo.save(b);
	}
//  -------------------------------
// UPDATE ----------------------------
	public Blog updateBlog(Long id, Blog b) {
		if(this.getBlogById(id) != null) {
			Blog temp = this.getBlogById(id);
			temp.setId(id);
			temp.setTextField(b.getTextField());
			temp.setTitle(b.getTitle());
			temp.setCreatedAt(temp.getCreatedAt());
			Blog updated = this.repo.save(temp);
			return updated;
		}
		else return null;
	}
//  -------------------------------
// DELETE ----------------------------
	public boolean deleteBlog(Long id) {
		this.repo.deleteById(id);
		return this.repo.existsById(id);
	}
	
//  -------------------------------
}
 