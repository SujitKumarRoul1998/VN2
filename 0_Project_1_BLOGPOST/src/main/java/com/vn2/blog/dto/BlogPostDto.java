package com.vn2.blog.dto;

import lombok.Data;

@Data
public class BlogPostDto {

	private Integer blogId;
	
	private String title;
	
	private String description;
	
	private String content;
}
