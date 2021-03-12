package com.example.baitapt6;

public class Good {
    private int image;
    private String name;
    private int price;

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Good(int image, String name, int price) {
        this.image = image;
        this.name = name;
        this.price = price;
    }
}
