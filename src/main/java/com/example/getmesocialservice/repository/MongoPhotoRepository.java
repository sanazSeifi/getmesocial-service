package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.MongoPhoto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoPhotoRepository extends MongoRepository<MongoPhoto, String> {
}
