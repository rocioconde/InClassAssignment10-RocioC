package com.example.android.inclassassignment10_rocioc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Meal> meals;
    private MealsAdapter mealsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mealsAdapter = new MealsAdapter(meals, this);
        recyclerView.setAdapter(mealsAdapter);
    }

    public void addRandomMeal(View view) {
        meals.add(getRandomMeal());
        mealsAdapter.notifyDataSetChanged();
    }

    private void initialData() {
        meals = new ArrayList<>();
        meals.add(new Meal("Pepperoni Pizza", 7.30, 700, R.drawable.pizza));
        meals.add(new Meal("Caesar Salad", 5.00, 600, R.drawable.salad));
        meals.add(new Meal("Cheeseburger and Fries", 8.50, 750, R.drawable.cheeseburger));
    }

    private Meal getRandomMeal() {
        int num = (int) (Math.random() * 3);
        if (num == 0)
            return new Meal("Pepperoni Pizza", 7.30, 700, R.drawable.pizza);
        else if (num == 1)
            return new Meal("Caesar Salad", 5.00, 600, R.drawable.salad);
        else
            return new Meal("Cheeseburger and Fries", 8.50, 750, R.drawable.cheeseburger);
    }
}
