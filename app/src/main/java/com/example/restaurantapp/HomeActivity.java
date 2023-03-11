package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {
    CardView staterscard;
    CardView maincard;
    CardView dessertcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        staterscard = findViewById(R.id.card_view_starters);
        maincard = findViewById(R.id.card_view_main_course);
        dessertcard = findViewById(R.id.card_view_desert);

        staterscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent statersActivityIntent = new Intent(HomeActivity.this, StartresActivity.class);
                startActivity(statersActivityIntent);
            }
        });

        maincard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainCourseActivityIntent = new Intent(HomeActivity.this, MainCoursesActivity.class);
                startActivity(mainCourseActivityIntent);
            }
        });

        dessertcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent desertActiviteIntent = new Intent(HomeActivity.this, DessertActivity.class);
                startActivity(desertActiviteIntent);
            }
        });
    }
}