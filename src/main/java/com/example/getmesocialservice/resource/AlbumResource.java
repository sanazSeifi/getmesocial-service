package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumResource {
@Autowired
    private AlbumService albumService;

@GetMapping("/album")
    public Album getAlbum(){
    return albumService.getAlbum();
}
@PostMapping("/album")
    public  Album saveAlbum(@RequestBody Album album){
    return AlbumService.saveAlbum(album);
}

@GetMapping("/allAlbums")
    public List<Album> GetAllAlbums(){
    return AlbumService.getAllAlbums();
}
@GetMapping("/album/{albumId}")
    public Album getAlbumById(@PathVariable("albumId") int albumId){
    return albumService.getAlbumById(albumId);
}

}


