package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.MongoAlbum;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoAlbumRepository extends MongoRepository<MongoAlbum, String> {
}
