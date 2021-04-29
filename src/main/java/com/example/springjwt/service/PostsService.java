package com.example.springjwt.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.example.springjwt.models.Posts;  
import com.example.springjwt.repository.PostsRepository;  
//defining the business logic  
@Service  
public class PostsService   
{  
@Autowired  
PostsRepository postsRepository;  
//getting all posts record by using the method findaAll() of CrudRepository  
public List<Posts> getAllPosts()   
{  
List<Posts> posts = new ArrayList<Posts>();  
postsRepository.findAll().forEach(posts1 -> posts.add(posts1));  
return posts;  
}  
//getting a specific record by using the method findById() of CrudRepository  
public Posts getPostsById(int id)   
{  
return postsRepository.findById(id).get();  
}  
//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(Posts posts)   
{  
postsRepository.save(posts);  
}  
//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(int id)   
{  
postsRepository.deleteById(id);  
}  
//updating a record  
public void update(Posts posts, int postid)   
{  
postsRepository.save(posts);  
}  
}  