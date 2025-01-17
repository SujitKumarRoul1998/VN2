package com.vn2.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vn2.blog.dto.BlogPostDto;
import com.vn2.blog.service.BlogPostService;

@RestController
@RequestMapping("/api/posts")
public class BlogPostController {
	
	private BlogPostService blogPostService;
@Autowired
public BlogPostController(BlogPostService blogPostService) {
		super();
		this.blogPostService = blogPostService;
	}

@PostMapping
public ResponseEntity<BlogPostDto> createBlog(@RequestBody BlogPostDto blogpost){
	BlogPostDto createblogPost=blogPostService.createBlogPost(blogpost);
	
	return new ResponseEntity(createblogPost,HttpStatus.CREATED);
}

@GetMapping("/{postId}")
public ResponseEntity<BlogPostDto> findBlogById(@PathVariable("postId") Integer id){
	BlogPostDto findByblogPostId=blogPostService.findByBlogPostId(id);
	return new ResponseEntity(findByblogPostId,HttpStatus.OK);

}

@GetMapping
public ResponseEntity<BlogPostDto> getAllBlogPost(){
	List<BlogPostDto> allBlogPost=blogPostService.getAllBlogPost();
	
	return new ResponseEntity(allBlogPost,HttpStatus.OK);
}


@PutMapping
public ResponseEntity<BlogPostDto> updateBlogPost(@RequestBody BlogPostDto blogpost){
	
	BlogPostDto updateBlogPost = blogPostService.updateBlogPost(blogpost);
	
	return new ResponseEntity(updateBlogPost,HttpStatus.OK);
	
}
/*
 * @GetMapping public ResponseEntity<String> testHello(){
 * 
 * String hello="Hello World"; ResponseEntity<String> resp=new
 * ResponseEntity<>("Hello" ,HttpStatus.NOT_FOUND);
 * 
 * return resp;
 *  }
 */

}
