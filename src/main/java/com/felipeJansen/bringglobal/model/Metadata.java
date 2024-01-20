package com.felipeJansen.bringglobal.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Metadata {
    private String narrative;
    private List<Comment> comments;
    private List<Tag> tags;
    private List<Image> images;
    private Location where;

    private String public_alias;
    private String private_alias;
    private String more_info;
    private String url;
    private String image_URL;
    private String open_corporates_URL;

    public String getPublic_alias() {
        return public_alias;
    }

    public void setPublic_alias(String public_alias) {
        this.public_alias = public_alias;
    }

    public String getPrivate_alias() {
        return private_alias;
    }

    public void setPrivate_alias(String private_alias) {
        this.private_alias = private_alias;
    }

    public String getMore_info() {
        return more_info;
    }

    public void setMore_info(String more_info) {
        this.more_info = more_info;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage_URL() {
        return image_URL;
    }

    public void setImage_URL(String image_URL) {
        this.image_URL = image_URL;
    }

    public String getOpen_corporates_URL() {
        return open_corporates_URL;
    }

    public void setOpen_corporates_URL(String open_corporates_URL) {
        this.open_corporates_URL = open_corporates_URL;
    }

    public String getNarrative() {
        return narrative;
    }

    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Location getWhere() {
        return where;
    }

    public void setWhere(Location where) {
        this.where = where;
    }
}