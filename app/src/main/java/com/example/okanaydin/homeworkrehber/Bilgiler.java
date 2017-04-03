package com.example.okanaydin.homeworkrehber;

/**
 * Created by okanaydin on 03/04/17.
 */

public class Bilgiler {

    private String title, desc, image;

    public Bilgiler(){

    }

    public Bilgiler(String title, String desc, String image) {
        this.title = title;
        this.desc = desc;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
