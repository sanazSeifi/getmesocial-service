package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.MongoUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoUserRepository extends MongoRepository<MongoUser, String> {
}
