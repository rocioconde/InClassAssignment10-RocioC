package com.example.android.inclassassignment10_rocioc;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by ccteuser on 4/10/17.
 */

public class MealsAdapter extends RecyclerView.Adapter<MealViewHolder> {

    private List<Meal> meals;
    private Context context;

    public MealsAdapter(List<Meal> meals, Context context) {
        this.meals = meals;
        this.context = context;
    }

    @Override
    public MealViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_meal, parent, false);
        return new MealViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(MealViewHolder holder, int position) {
        Meal meal = meals.get(position);
        holder.bind(meal);
    }

    @Override
    public int getItemCount() {
        return meals.size();
    }
}
