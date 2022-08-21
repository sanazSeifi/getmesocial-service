package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumResource {
//    public AlbumResource(){
//        albumService=new AlbumService();
//    }
    @Autowired
    private AlbumService albumService;
    @PostMapping("/album")
    public Album saveAlbum(@RequestBody Album album){

        return albumService.saveAlbum(album);
    }
// @GetMapping("/album")
//    public Album getAlbum(){
//    return albumService.getAlbum();
//}
//    @PostMapping("/AllAlbum")
//    public List<Album> AllAlbum(@RequestBody Album album){
//
//        return albumService.getAllAlbums();
//    }
//
//@GetMapping("/allAlbums")
//    public List<Album> GetAllAlbums(){
//    return albumService.getAllAlbums();
//}
//
//    @GetMapping("/album/{albumId}")
//    public Album getAlbumById(@PathVariable("albumId") int albumId){
//        return albumService.getAlbumById(albumId);
//    }
//
//    @PutMapping("/album/{albumId}")
//    public Album updateAlbum(@PathVariable("albumId") int albumId, @RequestBody Album album){
//        return albumService.updateAlbum(albumId, album);
//    }
//
//    @DeleteMapping("/album")
//    public  Album deleteAlbum(@RequestParam(name = "albumId") int albumId){
//    return  albumService.deleteAlbum(albumId);
//    }


}


