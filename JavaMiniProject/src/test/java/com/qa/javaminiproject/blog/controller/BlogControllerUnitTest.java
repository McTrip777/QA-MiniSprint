package com.qa.javaminiproject.blog.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BlogControllerUnitTest {

	@Autowired
	private BlogController controller;
	
	@Test
	public void getAllBlogsTest() throws Exception {
		assertNotNull(controller);
	}
	
}
