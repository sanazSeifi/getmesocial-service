package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.repository.AlbumRepositoryClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlbumService {
//    private AlbumRepository almrepo;
//    public AlbumService(){
//        almrepo=new AlbumRepository();
//    }
//    public Album getAlbum(){

//        return almrepo.getAlbum();
//    }
    @Autowired
    private AlbumRepositoryClass albumRepository;
    public Album saveAlbum(Album album){
        return albumRepository.save(album);
    }
//    public  List<Album> getAllAlbums() {
//        return  almrepo.getAllAlbums();
//    }

//    public Album getAlbumById(int albumId) {
//        return albumRepository.getAlbumById(albumId);
//    }

//    public Album updateAlbum(int albumId, Album album) {
//      return albumRepository.updateAlbum(albumId, album);
//    }

//    public Album deleteAlbum(int albumId) {
//        return albumRepository.deleteAlbum(albumId);
//    }
}
