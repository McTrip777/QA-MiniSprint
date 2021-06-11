package com.qa.javaminiproject.blog.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.javaminiproject.blog.domain.Blog;

@Repository
public interface BlogRepo extends JpaRepository<Blog, Long>{
	

}
