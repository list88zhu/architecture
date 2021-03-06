package com.shanian.arch.mvvm.bean;

public class PhotosBean {
    /**
     * thumb : https://img1.doubanio.com/view/photo/m/public/p2220782208.jpg
     * image : https://img1.doubanio.com/view/photo/l/public/p2220782208.jpg
     * cover : https://img1.doubanio.com/view/photo/sqs/public/p2220782208.jpg
     * alt : https://movie.douban.com/celebrity/1274242/photo/2220782208/
     * id : 2220782208
     * icon : https://img1.doubanio.com/view/photo/s/public/p2220782208.jpg
     */

    private String thumb;
    private String image;
    private String cover;
    private String alt;
    private String id;
    private String icon;

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}