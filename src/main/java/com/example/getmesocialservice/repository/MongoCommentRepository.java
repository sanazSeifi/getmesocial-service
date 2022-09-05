package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.MongoComment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoCommentRepository extends MongoRepository<MongoComment, String> {
}
