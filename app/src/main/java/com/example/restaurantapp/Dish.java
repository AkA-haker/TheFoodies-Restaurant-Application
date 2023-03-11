package com.example.restaurantapp;

import androidx.annotation.NonNull;

public class Dish {
    String title;
    String description;
    String price;
    float raring;
    int image;

    public Dish(String title, String description, String price, float raring, int image) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.raring = raring;
        this.image = image;
    }
}
