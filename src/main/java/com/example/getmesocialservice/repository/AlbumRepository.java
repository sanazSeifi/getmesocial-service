package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {
    List<Album> albumList = new ArrayList();

    public Album getAlbum() {
        Album album = new Album(22, "SanazAlbum", "FamilyPics", "http://localhost:8080/api/album");
        return album;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List<Album> getAllAlbums() {
        return albumList;
    }

    public Album saveAlbum(Album album) {
        album.setAlbumId(albumList.size() + 1);
        albumList.add(album);
        return album;
    }

    public Album getAlbumById(int albumId) {
        for (Album album : albumList) {
            if (album.getAlbumId() == albumId) {
                return album;
            }
        }
        return null;
    }

    public Album updateAlbum(int albumId, Album album) {
        for (Album a : albumList) {
            if (a.getAlbumId() == albumId) {
                a.setName(album.getName());
//                a.setAlbumId(album.getAlbumId());
                a.setDescription(album.getDescription());
                a.setCoverPicUrl(album.getCoverPicUrl());
                return a;
            }
        }
        return null;
    }


    public Album deleteAlbum(int albumId) {
        Album deletedAlbum = null;
        for(Album a:albumList){
            if(a.getAlbumId() == albumId){
                deletedAlbum = a;
                albumList.remove(a);
                return deletedAlbum;
            }
        }
        return deletedAlbum;
    }
}
