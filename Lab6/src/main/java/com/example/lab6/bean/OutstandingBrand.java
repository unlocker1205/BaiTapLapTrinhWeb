package com.example.lab6.bean;

public class OutstandingBrand {
    private String image;
    private String outstanding;

    public OutstandingBrand(String image, String outstanding) {
        this.image = image;
        this.outstanding = outstanding;
    }

    public OutstandingBrand(){

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getOutstanding() {
        return outstanding;
    }

    public void setOutstanding(String outstanding) {
        this.outstanding = outstanding;
    }
}
