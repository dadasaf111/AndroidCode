package com.example.a18020331_nguyenxuanhai_baitap;

public class Goods {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageGoods() {
        return imageGoods;
    }

    public void setImageGoods(int imageGoods) {
        this.imageGoods = imageGoods;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    private String name;
    private int imageGoods;
    private String price;

    public Goods(String name, int imageGoods, String price) {
        this.name = name;
        this.imageGoods = imageGoods;
        this.price = price;
    }
}
