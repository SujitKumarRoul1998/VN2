package com.vn2.blog.service;

import java.util.List;

import com.vn2.blog.dto.BlogPostDto;

public interface BlogPostService {

	BlogPostDto createBlogPost(BlogPostDto blogpostdto);
	
	BlogPostDto findByBlogPostId(Integer id);
	
	List<BlogPostDto> getAllBlogPost();
	
	BlogPostDto updateBlogPost(BlogPostDto blogpostdto);
}
