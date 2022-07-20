package com.example.getmesocialservice.repository;


import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    List<User> userList = new ArrayList<>();
    public User getUser(){
        User user = new User("Sanaz","Canada",22,"http://www.mypicurl");
        return user;
    }

    public User saveUser(User user) {
    userList.add(user);
    return user;
    }
}
