package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.MongoAlbum;
import com.example.getmesocialservice.service.MongoAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class MongoAlbumResource {
    @Autowired
    private MongoAlbumService mongoAlbumService;

    @PostMapping("/album")
    public MongoAlbum createAlbum(@RequestBody MongoAlbum mongoAlbum){
        mongoAlbumService.createAlbum(mongoAlbum);
        return mongoAlbum;
    }
    @GetMapping("/albums")
    public List<MongoAlbum> getAllAlbums() {
        return mongoAlbumService.getAllAlbums();

    }
    @GetMapping("/album")
    public Optional<MongoAlbum> getById(@RequestParam (name = "id") String id) {
        return mongoAlbumService.getById(id);

    }
    @PutMapping("/album")
    public MongoAlbum updateAlbum(@RequestBody MongoAlbum mongoAlbum){
        return mongoAlbumService.updateAlbum(mongoAlbum);

    }
    @DeleteMapping("/album")
    public void deleteMongoAlbum(@RequestParam(name = "id") String albumId) {
        mongoAlbumService.deleteAlbum(albumId);

    }

}
