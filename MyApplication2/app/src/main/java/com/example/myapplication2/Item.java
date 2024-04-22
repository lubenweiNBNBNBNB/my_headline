package com.example.myapplication2;

public class Item {
    private String name;
    private String imageId;

    public Item(String name,String imageId)
    {
        this.name = name;
        this.imageId = imageId;
    }
    public String getName(){return name;}
    public String getImageId(){return imageId;}
}
