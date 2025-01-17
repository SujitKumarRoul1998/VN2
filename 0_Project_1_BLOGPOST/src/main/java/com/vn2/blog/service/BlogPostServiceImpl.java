package com.vn2.blog.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vn2.blog.dto.BlogPostDto;
import com.vn2.blog.entity.BlogPost;
import com.vn2.blog.exception.ResourceNotFoundException;
import com.vn2.blog.repo.BlogPostRepo;

@Service
public class BlogPostServiceImpl implements BlogPostService {
	
	
	private BlogPostRepo blogPostRepo;
	
	@Autowired
	public BlogPostServiceImpl(BlogPostRepo blogPostRepo) {
		super();
		this.blogPostRepo = blogPostRepo;
	}

	@Override
	public BlogPostDto createBlogPost(BlogPostDto blogpostdto) {
		
		BlogPost save = blogPostRepo.save(mapDtoToEntity(blogpostdto));
		return mapEntityToDto(save);
	}
	
	//conversion of Dto Object to Entity Object.
	   private BlogPost mapDtoToEntity(BlogPostDto blogpostdto) {
		
		BlogPost blogPost=new BlogPost();
		blogPost.setBlogId(blogpostdto.getBlogId());
		blogPost.setContent(blogpostdto.getContent());
		blogPost.setDescription(blogpostdto.getDescription());
		blogPost.setTitle(blogpostdto.getTitle());
		
		return blogPost;
	}
	
	//conversion of Entity Object to Dto Object.
		private BlogPostDto mapEntityToDto(BlogPost blogpost) {
			
			BlogPostDto blogPostDto=new BlogPostDto();
			blogPostDto.setBlogId(blogpost.getBlogId());
			blogPostDto.setContent(blogpost.getContent());
			blogPostDto.setDescription(blogpost.getDescription());
			blogPostDto.setTitle(blogpost.getTitle());
			
			return blogPostDto;
		}

		@Override
		public BlogPostDto findByBlogPostId(Integer id) {
			Optional<BlogPost> findByid = blogPostRepo.findById(id);
			BlogPost blogPost= findByid.orElseThrow(()->new ResourceNotFoundException("BlogPost","ID", id));
			return mapEntityToDto(blogPost);
		}

		@Override
		public List<BlogPostDto> getAllBlogPost() {
			List<BlogPost> findAll=blogPostRepo.findAll();
			
			return findAll.stream().map(blogpost->mapEntityToDto(blogpost)).toList();
			
			/*
			 * List<BlogPostDto> blogPostDto=new ArrayList<>(); 
			 * for(BlogPost blogPost:findAll) 
			 * {
			 *  blogPostDto.add(mapEntityToDto(blogPost)); 
			 *  }
			 */
			
		}
//Update The Record
		@Override
		public BlogPostDto updateBlogPost(BlogPostDto blogpostdto) {
			Optional<BlogPost> findByid = blogPostRepo.findById(blogpostdto.getBlogId());
	//	findByid.orElseThrow(()->new ResourceNotFoundException("BlogPost","ID", blogpostdto.getBlogId()));
		
		BlogPost update=null;
		
			if(findByid.isPresent()) {
			 update = blogPostRepo.save(mapDtoToEntity(blogpostdto));
			}else {
				throw new ResourceNotFoundException("BlogPost","ID", blogpostdto.getBlogId());
			}
			
			return mapEntityToDto(update);
		}
		
		
}
