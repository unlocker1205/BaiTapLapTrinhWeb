package com.example.lab6.bean;

public class ProductItems {
    private String image;
    private String titleItem;
    private String slogan;

    public ProductItems(){

    }

    public ProductItems(String image, String titleItem, String slogan) {
        this.image = image;
        this.titleItem = titleItem;
        this.slogan = slogan;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitleItem() {
        return titleItem;
    }

    public void setTitleItem(String titleItem) {
        this.titleItem = titleItem;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }
}
