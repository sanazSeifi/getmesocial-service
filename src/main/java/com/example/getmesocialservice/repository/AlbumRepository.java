package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {
    static List <Album> albumList = new ArrayList<>();
    public static Album getAlbum(){
        Album album = new Album(22,"SanazAlbum","FamilyPics","http://localhost:8080/api/album");
        return album;
    }

    public static List<Album> getAllAlbums() {
        return getAllAlbums();
    }

    public Album saveAlbum(Album album){
        album.setAlbumId(albumList.size() + 1);
        albumList.add(album);
        return album;
    }

    public Album getAlbumById(int albumId) {
        for(Album album:albumList){
            if(album.getAlbumId() == albumId){
                return album;
            }
        }
        return null;
    }
}
