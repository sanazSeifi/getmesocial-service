package com.example.getmesocialservice.model;

import nonapi.io.github.classgraph.json.Id;

public class Album {

    @Id
    private String id;
    private String name;
    private String coverPhotoUrl;
    private  String createdBy;
    private String dataCreated;

public Album(String id, String name, String description, String coverPicUrl){
    this.id = id;
    this.name = name;
    this.coverPhotoUrl = coverPhotoUrl;
    this.createdBy = createdBy;
    this.dataCreated = dataCreated;
}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverPhotoUrl() {
        return coverPhotoUrl;
    }

    public void setCoverPhotoUrl(String coverPhotoUrl) {
        this.coverPhotoUrl = coverPhotoUrl;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDataCreated() {
        return dataCreated;
    }

    public void setDataCreated(String dataCreated) {
        this.dataCreated = dataCreated;
    }
}
