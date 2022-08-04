package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    @Autowired
    private static AlbumRepository albumRepository;

    public static List<Album> getAllAlbums() {
        return AlbumRepository.getAllAlbums();
    }

    public Album getAlbum(){
        return AlbumRepository.getAlbum();
    }
    public static Album saveAlbum(Album album){
        return albumRepository.saveAlbum(album);
    }


    public Album getAlbumById(int albumId) {
        return albumRepository.getAlbumById(albumId);
    }
}
