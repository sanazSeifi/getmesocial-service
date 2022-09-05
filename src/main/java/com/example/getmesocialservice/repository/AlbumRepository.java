package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

    @Repository
    public interface AlbumRepository extends MongoRepository<Album, String> {
}
