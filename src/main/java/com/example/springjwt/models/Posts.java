package com.example.springjwt.models;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  

@Entity
@Table

public class Posts {

    @Id
    @Column
    private int postid;
    @Column
    private String postname;
    @Column
    private String postbody;
     
    public int getPostid()   
    {  
        return postid;  
    }  
    public void setPostid(int postid)   
    {  
        this.postid = postid;  
    }  
    public String getPostname()  
    {  
        return postname;  
    }  
    public void setPostname(String postname)   
    {  
        this.postname = postname;  
    }  
    public String getPostbody()   
    {  
        return postbody;  
    }  
    public void setPostbody(String postbody)   
    { 
        this.postbody = postbody;  
    }  



}