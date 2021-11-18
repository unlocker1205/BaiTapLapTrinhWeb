package com.example.lab6.bean;

import java.io.Serializable;

public class ProductLab6 implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String description;
    private int price;
    private int sellPrice;
    private int quality;
    private String image;

    public ProductLab6(){

    }

    public ProductLab6(String id, String name, String description, int price, int sellPrice, int quality, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.sellPrice = sellPrice;
        this.quality = quality;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
