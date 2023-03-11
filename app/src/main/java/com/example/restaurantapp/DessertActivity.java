package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        RecyclerView dessertList=findViewById(R.id.recycler_view_dessert);
        Dish[] dessertItemlList={
                new Dish("Cocoa and blackcurrant cake", "Moist cake made with cocoa and fresh blackcurrant", "499",4.5f,R.drawable.cocoa_and_blackcurrant_cake),
                new Dish("Mulberry and cardamom crumble", "Fresh mulberry and green cardamom topped with butter crumble", "699",3.5f,R.drawable.mulberry_and_cardamom_crumble),
                new Dish("Lemon scones with chilli jam", "Vegan scones served with chilli jam and fresh coconut cream", "599",2.5f,R.drawable.lemon_scones_with_chilli_jam),
                new Dish("Potato and banana vegan crepes", "Crispy vegan crepes filled with fresh potato and banana", "599",4.5f,R.drawable.potato_and_banana_vegan_crepes),
                new Dish("Cinnamon and treacle buns", "Crumbly buns made with cinnamon and dark treacle", "499",3.5f,R.drawable.cinnamon_and_treacle_buns),
        };
        ItemAdapter adapter=new ItemAdapter(dessertItemlList);
        dessertList.setAdapter(adapter);

    }
}