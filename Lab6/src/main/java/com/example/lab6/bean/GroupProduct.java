package com.example.lab6.bean;

import java.util.ArrayList;

public class GroupProduct {
    private ArrayList<ProductItems> listItems;
    private String titleGr;
    private String poster;

    public GroupProduct(){

    }

    public GroupProduct(ArrayList<ProductItems> listItems, String titleGr, String poster) {
        this.listItems = listItems;
        this.titleGr = titleGr;
        this.poster = poster;
    }

    public ArrayList<ProductItems> getListItems() {
        return listItems;
    }

    public void setListItems(ArrayList<ProductItems> listItems) {
        this.listItems = listItems;
    }

    public String getTitleGr() {
        return titleGr;
    }

    public void setTitleGr(String titleGr) {
        this.titleGr = titleGr;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
