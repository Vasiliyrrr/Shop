package com.example.shop5.Catedories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.shop5.Panel.CartActivity;
import com.example.shop5.Panel.FavoritesActivity;
import com.example.shop5.Panel.HomeActivity;
import com.example.shop5.Panel.ProfileActivity;
import com.example.shop5.R;

public class BathroomActivity extends AppCompatActivity {
    private ImageView home, cart, map, favorites, user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bathroom);

        home = (ImageView) findViewById(R.id.home);
        cart = (ImageView) findViewById(R.id.cart);
        favorites = (ImageView) findViewById(R.id.favorites);
        user = (ImageView) findViewById(R.id.user);



        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(BathroomActivity.this, HomeActivity.class);
                startActivity(loginIntent);
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(BathroomActivity.this, CartActivity.class);
                startActivity(loginIntent);
            }
        });


        favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(BathroomActivity.this, FavoritesActivity.class);
                startActivity(loginIntent);
            }
        });

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(BathroomActivity.this, ProfileActivity.class);
                startActivity(loginIntent);
            }
        });
    }
}