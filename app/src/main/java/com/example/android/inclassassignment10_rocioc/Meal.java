package com.example.android.inclassassignment10_rocioc;

import java.io.Serializable;

/**
 * Created by ccteuser on 4/10/17.
 */

public class Meal implements Serializable {

    public String description;
    public double price;
    public int calories;
    public int photoId;

    public Meal(String description, double price, int calories, int photoId) {
        this.description = description;
        this.price = price;
        this.calories = calories;
        this.photoId = photoId;
    }
}
