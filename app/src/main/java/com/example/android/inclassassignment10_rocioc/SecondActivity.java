package com.example.android.inclassassignment10_rocioc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    private ImageView mealPhoto;
    private TextView mealDescription;
    private TextView mealPrice;
    private TextView mealCalories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mealPhoto = (ImageView) findViewById(R.id.meal_photo);
        mealDescription = (TextView) findViewById(R.id.meal_description);
        mealPrice = (TextView) findViewById(R.id.meal_price);
        mealCalories = (TextView) findViewById(R.id.meal_calories);

        Intent intent = getIntent();
        Meal newMeal = (Meal) intent.getSerializableExtra(Keys.MEALS);
        mealPhoto.setImageResource(newMeal.photoId);
        mealDescription.setText(newMeal.description);
        mealPrice.setText(String.valueOf(newMeal.price));
        mealCalories.setText(String.valueOf(newMeal.calories));


    }
}
