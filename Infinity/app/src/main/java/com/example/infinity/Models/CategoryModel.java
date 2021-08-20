package com.example.infinity.Models;

public class CategoryModel {


    public CategoryModel(){
        //empty//
    }


    private  int img_cat;
    private String title_cat;

    public CategoryModel(int img_cat, String title_cat) {
        this.img_cat = img_cat;
        this.title_cat = title_cat;
    }

    public int getImg_cat() {
        return img_cat;
    }

    public void setImg_cat(int img_cat) {
        this.img_cat = img_cat;
    }

    public String getTitle_cat() {
        return title_cat;
    }

    public void setTitle_cat(String title_cat) {
        this.title_cat = title_cat;
    }
}
