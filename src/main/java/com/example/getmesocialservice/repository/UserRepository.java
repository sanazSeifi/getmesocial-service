package com.example.getmesocialservice.repository;


import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User getUser(){
        User user = new User("Sanaz","Canada",22,"http://www.mypicurl");
        return user;
    }
}
