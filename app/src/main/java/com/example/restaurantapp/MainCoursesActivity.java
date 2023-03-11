package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);


        RecyclerView mainCourseList=findViewById(R.id.recycler_view_main_course);
        Dish[] mainCourseItemshes = {
                new Dish("Thai basil and mulberry salad", "A crisp salad featuring fresh thai basil and mulberry", "1499",4.5f,R.drawable.thai_basil_and_mulberry_salad),
                new Dish("Onion and apple ciabatta", "Warm ciabatta filled with caramalised onion and fresh apple", "1299",3.5f,R.drawable.onion_and_apple_ciabatta),
                new Dish("Onion and olive bread", "Crunchy bread made with baby onion and olive", "1199",4.2f,R.drawable.onion_and_olive_bread),
                new Dish("Onion and mustard soup", "Dried onion and French mustard combined into smooth soup", "1299",4.5f,R.drawable.onion_and_mustard_soup),
                new Dish("Samphire and rocket salad", "Samphire and fresh rocket served on a bed of lettuce", "1599",2.5f,R.drawable.samphire_and_rocket_salad),
                new Dish("Cocoa and chicory salad", "Cocoa and chicory served on a bed of lettuce", "1699",3.5f,R.drawable.cocoa_and_chicory_salad),
                new Dish("Cauliflower and squash curry", "Mild curry made with fresh cauliflower and butternut squash", "1499",3.2f,R.drawable.cauliflower_and_squash_curry),
                new Dish("Cauliflower and potato madras", "Medium-hot madras made with fresh cauliflower and new potato", "1399",4.5f,R.drawable.cauliflower_and_potato_madras)
        };
        ItemAdapter adapter=new ItemAdapter(mainCourseItemshes);
        mainCourseList.setAdapter(adapter);

    }


}