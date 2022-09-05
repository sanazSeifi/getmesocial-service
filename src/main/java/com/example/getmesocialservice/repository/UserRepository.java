package com.example.getmesocialservice.repository;


import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public User getUser() {
        User user = new User("Sanaz", "Toronto", 20, "https://sanaz.git.com");
        return user;
    }

}
