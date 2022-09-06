package com.example.getmesocialservice.service;


import com.example.getmesocialservice.model.MongoUser;
import com.example.getmesocialservice.repository.MongoUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MongoUserService {

    @Autowired
    private MongoUserRepository mongoUserRepository;

    public MongoUser createUser(MongoUser mongoUser) {
        return mongoUserRepository.save(mongoUser);
    }

    public List<MongoUser> getAllUsers() {
        return mongoUserRepository.findAll();
    }
    public Optional<MongoUser> getById(String userId) {
        return mongoUserRepository.findById(userId);
    }

    public MongoUser updateMongoUser(MongoUser mongoUser) {
        return mongoUserRepository.save(mongoUser);
    }

    public void deleteUser(String userId) {
        mongoUserRepository.deleteById(userId);
    }

    /*public Album getAlbum() {
        return mongoAlbumRepository.getAlbum();
    }

    public List<Album> getAllAlbum() {
        return mongoAlbumRepository.getAllAlbum();
    }

    public Album getSingleAlbum(int albumId) {
        return mongoAlbumRepository.getSingleAlbum(albumId);
    }

    public Album updateAlbum(int albumId, Album album) {
        return mongoAlbumRepository.updateAlbum(albumId, album);
    }

    public Album deleteAlbum(int albumId) {
        return mongoAlbumRepository.deleteAlbum(albumId);
    }*/
}

