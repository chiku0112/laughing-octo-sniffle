package com.example.springjwt.controllers;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springjwt.models.Posts;  
import com.example.springjwt.service.PostsService;  

@RestController
@RequestMapping("/api/post")
public class PostsController{
    @Autowired
    PostsService postsService;

    @GetMapping
    private List<Posts> getAllPosts()
    {
        return postsService.getAllPosts();
    }

    @GetMapping("{postid}")
    private Posts getPosts(@PathVariable("postid") int postid)
    {
        return postsService.getPostsById(postid);
    }

    @DeleteMapping("{postid}")
    private void deletePost(@PathVariable("postid") int postid)   
    {  
        postsService.delete(postid);  
    }  

    @PostMapping 
    private int savePost(@RequestBody Posts posts)   
    {  
        postsService.saveOrUpdate(posts);  
        return posts.getPostid();  
    }  

    @PutMapping 
    private Posts update(@RequestBody Posts posts)   
    {  
        postsService.saveOrUpdate(posts);  
        return posts;  
    }  
}
