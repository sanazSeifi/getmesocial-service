package com.example.getmesocialservice.repository;


import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    List<User> userList = new ArrayList<>();
    public User getUser(){
        User user = new User("sanaz","Canada",22,"http://localhost:8080/api/user");
        return user;
    }

    public User saveUser(User user) {
    userList.add(user);
    return user;
    }
}
