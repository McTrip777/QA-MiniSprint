package com.qa.javaminiproject.blog.service;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.qa.javaminiproject.blog.domain.Blog;
import com.qa.javaminiproject.blog.repo.BlogRepo;

@RunWith(MockitoJUnitRunner.class)
public class BlogServiceUnitTest {

	@Mock
	BlogRepo repo;
	
	@InjectMocks 
	BlogService service;
	
	@Test
	void getAllBlogs(){
//		return this.repo.findAll();
		
	}
	@Test
	void getBlogById(){
//		Optional<Blog> b = this.repo.findById(id);
//		return b.orElseThrow();
	}
	@Test
	void getBlogByTitle(){
//		return this.repo.findAllByType(title);
	}
// ---------------------------------
// CREATE ----------------------------
	@Test()
	void createBlog() throws NullPointerException{
//		return this.repo.save(b);
		Blog blog = new Blog(1L, "title", "text field", LocalDateTime.now());
		
		service.createBlog(blog);
		
//		assertThat(blogCreated.getTitle()).isSameAs(blog.getTitle());
	}
//  -------------------------------
// UPDATE ----------------------------
	@Test
	void updateBlog() {
//		if(this.getBlogById(id) != null) {
//			Blog temp = this.getBlogById(id);
//			temp.setId(id);
//			temp.setTextField(b.getTextField());
//			temp.setTitle(b.getTitle());
//			temp.setCreatedAt(temp.getCreatedAt());
//			Blog updated = this.repo.save(temp);
//			return updated;
//		}
//		else return null;
	}
//  -------------------------------
// DELETE ----------------------------
	@Test
	void deleteBlog() {
//		this.repo.deleteById(id);
//		return this.repo.existsById(id);
	}
}
