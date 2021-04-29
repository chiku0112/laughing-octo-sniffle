package com.example.springjwt.repository;  
import org.springframework.data.repository.CrudRepository;  
import com.example.springjwt.models.Posts;  
//repository that extends CrudRepository  
public interface PostsRepository extends CrudRepository<Posts, Integer>  
{  
}  