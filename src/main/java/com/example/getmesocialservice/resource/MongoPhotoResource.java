package com.example.getmesocialservice.resource;


import com.example.getmesocialservice.model.MongoPhoto;
import com.example.getmesocialservice.service.MongoPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class MongoPhotoResource {
    @Autowired
    private MongoPhotoService mongoPhotoService;

    @PostMapping("/photo")
    public MongoPhoto createPhoto(@RequestBody MongoPhoto mongoPhoto){
        mongoPhotoService.createPhoto(mongoPhoto);
        return mongoPhoto;
    }
    @GetMapping("/photos")
    public List<MongoPhoto> getAllPhotos() {
        return mongoPhotoService.getAllPhotos();

    }

    @GetMapping("/photo")
    public Optional<MongoPhoto> getById(@RequestParam (name = "id") String id) {
        return mongoPhotoService.getById(id);

    }
    @PutMapping("/photos")
    public MongoPhoto updateMongoPhotos(@RequestBody MongoPhoto mongoPhoto) {
        return mongoPhotoService.updateMongoPhotos(mongoPhoto);

    }
    @DeleteMapping("/photo")
    public void deleteMongoPhoto(@RequestParam(name = "id") String photoId) {
        mongoPhotoService.deletePhoto(photoId);

    }


}

