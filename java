package com.example.reviewdapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        // Initialize ViewPager2 for the dynamic banner
        ViewPager2 bannerViewPager = findViewById(R.id.bannerViewPager);
        // Set up the adapter for the ViewPager2 (You need to create a BannerAdapter class)
        
        // Initialize RecyclerView for the categories
        RecyclerView categoriesRecyclerView = findViewById(R.id.categoriesRecyclerView);
        categoriesRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        // Set up the adapter for the RecyclerView (You need to create a CategoriesAdapter class)
    }
}
