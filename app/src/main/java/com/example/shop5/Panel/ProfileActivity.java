package com.example.shop5.Panel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.shop5.NADA.CategoriesActivity;
import com.example.shop5.NADA.PodActivity;
import com.example.shop5.R;

public class ProfileActivity extends AppCompatActivity
{
    private ImageView home, cart, favorites, user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        home = (ImageView) findViewById(R.id.home);
        cart = (ImageView) findViewById(R.id.cart);
        favorites = (ImageView) findViewById(R.id.favorites);
        user = (ImageView) findViewById(R.id.user);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(ProfileActivity.this, HomeActivity.class);
                startActivity(loginIntent);
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(ProfileActivity.this, CartActivity.class);
                startActivity(loginIntent);
            }
        });


        favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(ProfileActivity.this, FavoritesActivity.class);
                startActivity(loginIntent);
            }
        });

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(ProfileActivity.this, ProfileActivity.class);
                startActivity(loginIntent);
            }
        });
    }
}