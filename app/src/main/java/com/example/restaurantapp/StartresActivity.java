package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startres);
        RecyclerView statesrList = findViewById(R.id.recycler_view_starters);
        Dish[] statersItemList = {
                new Dish("Melon and lemon soup", "Fresh melon and lemon combined into creamy soup", "1199",4.3f, R.drawable.millon_lemon_supe),
                new Dish("Coconut and chocolate mousse", "A creamy mousse made with fresh coconut and milk chocolate", "899",3.5f, R.drawable.coconut_and_choco),
                new Dish("Spinach and cabbage wontons", "Thin wonton cases stuffed with fresh spinach and chinese cabbage", "799", 2.5f,R.drawable.spinach_and_cabbage_wontons),
                new Dish("Broccoli and cucumber soup", "Fresh broccoli and cucumber combined into creamy soup", "899",4.5f, R.drawable.broccoli_and_cucumber_soup),
                new Dish("Chilli and aubergine dip", "A dip made from scotch bonnet chilli and fresh aubergine", "999", 4.1f,R.drawable.chilli_and_aubergine_dip),
                new Dish("Chickpea and chilli gyoza", "Thin pastry cases stuffed with fresh chickpea and green chilli", "699", 4.5f,R.drawable.chickpea_and_chilli_gyoza),
                new Dish("Sprout and pineapple soup", "Fresh sprout and pineapple combined into creamy soup", "899", 3.5f,R.drawable.sprout_and_pineapple_soup),
                new Dish("Egusi and borscht soup", "Egusi and borscht combined into creamy soup", "1299",4.5f, R.drawable.egusi_and_borscht_soup)
        };
        ItemAdapter adapter = new ItemAdapter(statersItemList);
        statesrList.setAdapter(adapter);


    }
}