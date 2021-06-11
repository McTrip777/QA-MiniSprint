package com.qa.javaminiproject.blog.domain;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Blog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String textField;
	private LocalDateTime createdAt;
	
	public Blog() {
	}
	
	public Blog(String title, String textField, LocalDateTime createdAt) {
		this.title = title;
		this.textField = textField;
		this.createdAt = createdAt.now();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTextField() {
		return textField;
	}

	public void setTextField(String textField) {
		this.textField = textField;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "id=" + id + ", title= " + title + ", textField= " + textField + ", createdAt= " + createdAt;
	}
}
