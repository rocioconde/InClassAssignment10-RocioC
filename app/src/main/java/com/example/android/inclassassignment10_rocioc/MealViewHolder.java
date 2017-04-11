package com.example.android.inclassassignment10_rocioc;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ccteuser on 4/10/17.
 */

public class MealViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView mealDescriptionView;
    private TextView mealPriceView;
    private TextView mealCaloriesView;
    private ImageView mealPhotoView;
    private Context context;

    public MealViewHolder(View itemView, Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        mealDescriptionView = (TextView) itemView.findViewById(R.id.meal_description);
        mealPriceView = (TextView) itemView.findViewById(R.id.meal_price);
        mealCaloriesView = (TextView) itemView.findViewById(R.id.meal_calories);
        mealPhotoView = (ImageView) itemView.findViewById(R.id.meal_photo);
        this.context = context;
    }

    public void bind(final Meal meal) {
        mealDescriptionView.setText(meal.description);
        mealPriceView.setText(String.valueOf(meal.price));
        mealCaloriesView.setText(String.valueOf(meal.calories));
        mealPhotoView.setImageResource(meal.photoId);


        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, SecondActivity.class);
                intent.putExtra(Keys.MEALS, meal);

                context.startActivity(intent);


//                Toast.makeText(context, mealDescriptionView.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
