package com.qa.javaminiproject.blog.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qa.javaminiproject.blog.domain.Blog;

@Repository
public interface BlogRepo extends JpaRepository<Blog, Long>{
	
	@Query(value = "SELECT DISTINCT * FROM BLOG WHERE TITLE ILIKE %?1%", nativeQuery = true)
	List<Blog> findAllByType(String type);
	
}
