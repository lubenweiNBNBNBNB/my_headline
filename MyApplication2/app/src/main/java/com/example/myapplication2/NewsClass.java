package com.example.myapplication2;

public class NewsClass {
    private String name;
    private int imageId;

    public NewsClass(String name,int imageId)
    {
        this.name = name;
        this.imageId = imageId;
    }
    public String getName(){return name;}
    public int getImageId(){return imageId;}
}
