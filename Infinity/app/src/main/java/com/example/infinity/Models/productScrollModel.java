package com.example.infinity.Models;

public class productScrollModel {

    public productScrollModel() {
        ///empty constructor
    }


    private int product_img;
    private String product_title;
    private String product_price;
    private String product_tax;

    public productScrollModel(int product_img, String product_title, String product_price, String product_tax) {
        this.product_img = product_img;
        this.product_title = product_title;
        this.product_price = product_price;
        this.product_tax = product_tax;
    }


    public int getProduct_img() {
        return product_img;
    }

    public void setProduct_img(int product_img) {
        this.product_img = product_img;
    }

    public String getProduct_title() {
        return product_title;
    }

    public void setProduct_title(String product_title) {
        this.product_title = product_title;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public String getProduct_tax() {
        return product_tax;
    }

    public void setProduct_tax(String product_tax) {
        this.product_tax = product_tax;
    }
}

