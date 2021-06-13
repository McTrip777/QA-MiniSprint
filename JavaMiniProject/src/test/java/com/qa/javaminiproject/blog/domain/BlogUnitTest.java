package com.qa.javaminiproject.blog.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class BlogUnitTest {

	@Mock Blog blog = new Blog(1L, "Title", "Text Field", LocalDateTime.now());
	@Mock Blog blog1 = new Blog("Title1", "Text Field 1");		
	@Mock Blog blog2 = new Blog();
	
	@BeforeEach
	void setup() {
	}
	
	@Test
	void getIdTest() throws Exception{
		assertEquals(1, blog.getId());
	}
	@Test
	void setIdTest() {
		blog.setId(2L);
		assertEquals(2L, blog.getId());
	}
	
	@Test
	void getTitleTest() {
		assertEquals("Title", blog.getTitle());
	}
	@Test
	void setTitleTest() {
		blog.setTitle("Title modified");
		assertEquals("Title modified", blog.getTitle());
	}
	
	@Test
	void getTextFieldTest() {
		assertEquals("Text Field", blog.getTextField());
	}
	@Test
	void setTextFieldTest() {
		blog.setTextField("Text Field Modified");
		assertEquals("Text Field Modified", blog.getTextField());
	}
	
	@Test
	void getCreatedAtTest() {
		fail("Yet to be implemented");
	}
	@Test
	void setCreatedAtTest() {
		fail("Yet to be implemented");
	}
	
	@Test
	void toStringTest() {
		assertEquals("id=" + blog.getId() + ", title= " + blog.getTitle() + ", textField= " + blog.getTextField() + ", createdAt= " + blog.getCreatedAt(), blog.toString());
	}
}
