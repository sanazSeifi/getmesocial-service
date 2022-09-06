package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.MongoAlbum;
import com.example.getmesocialservice.repository.MongoAlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MongoAlbumService {
    @Autowired
    private MongoAlbumRepository mongoAlbumRepository;


    public MongoAlbum createAlbum(MongoAlbum mongoAlbum) {
        return mongoAlbumRepository.save(mongoAlbum);
    }

    public List<MongoAlbum> getAllAlbums() {
        return mongoAlbumRepository.findAll();
    }

    public MongoAlbum updateAlbum(MongoAlbum mongoAlbum) {
        return mongoAlbumRepository.save(mongoAlbum);
    }

    public void deleteAlbum(String albumId) {
        mongoAlbumRepository.deleteById(albumId);
    }

    public Optional<MongoAlbum> getById(String id) {
        return mongoAlbumRepository.findById(id);
    }
}